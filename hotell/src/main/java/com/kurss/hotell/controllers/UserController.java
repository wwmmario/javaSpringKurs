package com.kurss.hotell.controllers;

import com.kurss.hotell.models.*;
import com.kurss.hotell.repo.SpecialRepository;
import com.kurss.hotell.repo.UserRepository;
import com.kurss.hotell.service.UserManager;
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
import java.util.Map;
import java.util.Optional;


@Controller
public class UserController {

    @Autowired
    private SpecialRepository specialRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserManager userManager;

    @GetMapping("/user")
    public String specialOptions(Model model) {

        UsernamePasswordAuthenticationToken userAuth = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        String userName = userAuth.getName();

        Optional<UserEntity> userOptional = userRepository.findById(userName);

        if (userOptional.isEmpty()) {
            return "error-not-found";
        }

        Iterable<Special> specials = specialRepository.findAll();
        model.addAttribute("specials", specials);

        model.addAttribute("user", userOptional.get());
        return "user";
    }

    @GetMapping("/{id}")
    public String userLogin(@PathVariable(value = "id") String id, Model model) {
        if (!userRepository.existsById(id)) {
            return "redirect:/login";
        }
        Optional<UserEntity> userEntity = userRepository.findById(id);
        ArrayList<UserEntity> res = new ArrayList<>();
        userEntity.ifPresent(res::add);
        model.addAttribute("userEntity", res);
        return "user";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        return "registration";
    }

    @PostMapping("/registration")
    public String createNewUser(@RequestParam(name = "floatingName") String floatingName,
                                @RequestParam(name = "floatingInput") String floatingInput,
                                @RequestParam(name = "floatingPhone") String floatingPhone,
                                @RequestParam(name = "floatingPassword") String floatingPassword, Model model) {



        if (userRepository.existsById(floatingName)) {
            model.addAttribute("errorUser","User Error");
            return "registration";
        }
        else {
            UserDto userDto = new UserDto();
            userDto.setName(floatingName);
            userDto.setName(floatingName);
            userDto.setMail(floatingInput);
            userDto.setPhone(floatingPhone);
            userDto.setPassword(floatingPassword);
            userManager.createUser(userDto);
            return "redirect:/login";
        }
    }


}