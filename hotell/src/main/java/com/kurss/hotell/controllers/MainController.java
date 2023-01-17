package com.kurss.hotell.controllers;


import com.kurss.hotell.models.Post;
import com.kurss.hotell.models.Question;
import com.kurss.hotell.repo.QuestionRepository;
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
public class MainController {
    @Autowired
    private QuestionRepository questionRepository;


    @GetMapping("/")
    public String home (Model model) {
        return "home";
    }

    @PostMapping("/")
    public String blogQuestionAdd (@RequestParam String mail, @RequestParam String question, Model model){
        Question questions = new Question(mail, question);
        questionRepository.save(questions);
        return "redirect:/";
    }
    @GetMapping("/question")
    public String questionMain (Model model) {
        Iterable<Question> questions = questionRepository.findAll();
        model.addAttribute("questions",questions);
        return "question";
    }

    @GetMapping("/question/{id}/edit")
    public String questionEdit (@PathVariable(value = "id") long id, Model model) {
        if(!questionRepository.existsById(id)){
            return "redirect:/blog";
        }
        Optional<Question> questiones = questionRepository.findById(id);
        ArrayList<Question> res = new ArrayList<>();
        questiones.ifPresent(res::add);
        model.addAttribute("questiones",res);
        return "question-edit";
    }

    @PostMapping("/question/{id}/edit")
    public String questionUpdate (@PathVariable(value = "id") long id, @RequestParam String done,  Model model){
        Question questiones = questionRepository.findById(id).orElseThrow();
        questiones.setDone(done);
        questionRepository.save(questiones);
        return "redirect:/question";
    }

    @PostMapping("/question/{id}/remove")
    public String questionDelete (@PathVariable(value = "id") long id,  Model model){
        Question questiones = questionRepository.findById(id).orElseThrow();
        questionRepository.delete(questiones);
        return "redirect:/question";
    }


}