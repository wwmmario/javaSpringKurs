package com.kurss.hotell.controllers;

import com.kurss.hotell.models.Post;
import com.kurss.hotell.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blogMain (Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts",posts);
        return "blog-main";
    }

    @GetMapping("/blog/add")
    public String blogAdd (Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts",posts);
        return "blog-add";
    }


    @PostMapping("/blog/add")
    public String blogPostAdd (@RequestParam String title, @RequestParam String anons,@RequestParam String full_text, @RequestParam String author,  Model model){
        Post post = new Post(title, anons, full_text, author);
        postRepository.save(post);
        return "redirect:/blog/add";
    }


    @GetMapping("/blog/details/{id}")
    public String blogDetails (@PathVariable(value = "id") long id, Model model) {
        if(!postRepository.existsById(id)){
            return "redirect:/blog";
        }
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post",res);
        return "blog-details";
    }

    @GetMapping("/blog/edit/{id}")
    public String blogEdit (@PathVariable(value = "id") long id, Model model) {
        if(!postRepository.existsById(id)){
            return "redirect:/blog";
        }
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post",res);
        return "blog-edit";
    }

    @PostMapping("/blog/edit/{id}")
    public String blogPostUpdate (@PathVariable(value = "id") long id, @RequestParam String title, @RequestParam String anons,@RequestParam String full_text, @RequestParam String author,  Model model){
        Post post = postRepository.findById(id).orElseThrow();
        post.setTitle(title);
        post.setAnons(anons);
        post.setFull_text(full_text);
        post.setAuthor(author);
        postRepository.save(post);
        return "redirect:/blog/add";
    }

    @PostMapping("/blog/remove/{id}")
    public String blogPostDelete (@PathVariable(value = "id") long id,  Model model){
        Post post = postRepository.findById(id).orElseThrow();
        postRepository.delete(post);
        return "redirect:/blog/add";
    }

}