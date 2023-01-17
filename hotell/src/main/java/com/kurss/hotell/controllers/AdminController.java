package com.kurss.hotell.controllers;


import com.kurss.hotell.models.Book;
import com.kurss.hotell.models.Special;
import com.kurss.hotell.models.UserEntity;
import com.kurss.hotell.repo.BookRepository;
import com.kurss.hotell.repo.SpecialRepository;
import com.kurss.hotell.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;


@Controller
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SpecialRepository specialRepository;

    @Autowired
    private BookRepository bookRepository;


    @GetMapping("/admin")
    public String admin (Model model) {

        UsernamePasswordAuthenticationToken userAuth = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        String userName = userAuth.getName();

        Optional<UserEntity> userOptional = userRepository.findById(userName);

        if (userOptional.isEmpty()) {
            return "error-not-found";
        }


        model.addAttribute("user", userOptional.get());

        return "admin";
    }



    @GetMapping("/user-controller")
    public String userController (Model model) {
        Iterable<UserEntity> users = userRepository.findAll();
        model.addAttribute("users",users);
        return "user-controller";
    }

    @GetMapping("/user-controller/edit/{name}")
    public String userEdit (@PathVariable(value = "name") String name, Model model) {
        if(!userRepository.existsById(name)){
            return "redirect:/user-controller";
        }
        Optional<UserEntity> user = userRepository.findById(name);
        ArrayList<UserEntity> res = new ArrayList<>();
        user.ifPresent(res::add);
        model.addAttribute("user",res);
        return "user-edit";
    }

    @PostMapping("/user-controller/edit/{name}")
    public String userUpdate (@PathVariable(value = "name") String name, @RequestParam String role,  Model model){
        UserEntity user = userRepository.findById(name).orElseThrow();
        user.setRole(role);
        userRepository.save(user);
        return "redirect:/user-controller";
    }

    @PostMapping("/user-controller/remove/{name}")
    public String userDelete (@PathVariable(value = "name") String name){
        userRepository.deleteById(name);
        return "redirect:/user-controller";
    }


    @GetMapping("/special")
    public String speciall (Model model) {
        Iterable<Special> specials = specialRepository.findAll();
        model.addAttribute("specials",specials);
        return "special";
    }

    @PostMapping("/special")
    public String specialAdd (@RequestParam String name_offers, @RequestParam String text_offers, Model model){
        Special special = new Special(name_offers, text_offers);
        specialRepository.save(special);
        return "redirect:/admin";
    }

    @GetMapping("/special/{id}/edit")
    public String specialEdit (@PathVariable(value = "id") long id, Model model) {
        if(!specialRepository.existsById(id)){
            return "redirect:/special";
        }
        Optional<Special> specialess = specialRepository.findById(id);
        ArrayList<Special> res = new ArrayList<>();
        specialess.ifPresent(res::add);
        model.addAttribute("specialess",res);
        return "special-edit";
    }

    @PostMapping("/special/{id}/edit")
    public String specialUpdate (@PathVariable(value = "id") long id, @RequestParam String name_offers, @RequestParam String text_offers,  Model model){
        Special specialess = specialRepository.findById(id).orElseThrow();
        specialess.setName_offers(name_offers);
        specialess.setText_offers(text_offers);
        specialRepository.save(specialess);
        return "redirect:/special";
    }

    @PostMapping("/special/{id}/remove")
    public String specialDelete (@PathVariable(value = "id") long id,  Model model){
        Special specialess = specialRepository.findById(id).orElseThrow();
        specialRepository.delete(specialess);
        return "redirect:/admin";
    }

    @GetMapping("/reserve")
    public String reserve (Model model) {
        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books",books);
        return "reserve";
    }


    @GetMapping("/reserve/edit/{id}")
    public String userEdit (@PathVariable(value = "id") long id, Model model) {
        if(!bookRepository.existsById(id)){
            return "redirect:/reserve";
        }
        Optional<Book> book =bookRepository.findById(id);
        ArrayList<Book> res = new ArrayList<>();
        book.ifPresent(res::add);
        model.addAttribute("book",res);
        return "reserve-edit";
    }

    @PostMapping("/reserve/edit/{id}")
    public String userUpdate (@PathVariable(value = "id") long id, @RequestParam String data_in, @RequestParam String data_out,@RequestParam String room, Model model){
        Book book = bookRepository.findById(id).orElseThrow();
        book.setData_in(data_in);
        book.setData_out(data_out);
        book.setRoom(room);
        bookRepository.save(book);
        return "redirect:/reserve";
    }

    @PostMapping("/reserve/remove/{id}")
    public String userDelete (@PathVariable(value = "id") long id){
        bookRepository.deleteById(id);
        return "redirect:/reserve";
    }



}