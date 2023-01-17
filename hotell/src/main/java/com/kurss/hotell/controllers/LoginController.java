package com.kurss.hotell.controllers;

import com.kurss.hotell.models.Post;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class LoginController {


    @GetMapping("/account")
    public String account (Model model) {

        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        for(GrantedAuthority role : authorities){
            String authority = role.getAuthority();
            String roleName = authority.replace("ROLE_", "");
            switch (roleName){
                case "USER":
                    return "redirect:/user";
                case "MANAGER":
                    return "redirect:/manager";
                case "ADMIN":
                    return "redirect:/admin";
                default:
                    return "redirect:/login";
            }
        }
        return "/error-not-found";
    }

    @GetMapping("/error-not-found")
    public String error (Model model){
        return "error-not-found";
    }
}
