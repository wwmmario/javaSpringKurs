package com.kurss.hotell.controllers;

import com.kurss.hotell.models.Question;
import com.kurss.hotell.models.UserEntity;
import com.kurss.hotell.repo.QuestionRepository;
import com.kurss.hotell.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;


@Controller
public class ManagerController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/manager")
    public String questionTask (Model model) {

        UsernamePasswordAuthenticationToken userAuth = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        String userName = userAuth.getName();

        Optional<UserEntity> userOptional = userRepository.findById(userName);

        if (userOptional.isEmpty()) {
            return "error-not-found";
        }

        model.addAttribute("user", userOptional.get());

        Iterable<Question> questions = questionRepository.findAll();
        model.addAttribute("questions",questions);
        return "manager";
    }

}