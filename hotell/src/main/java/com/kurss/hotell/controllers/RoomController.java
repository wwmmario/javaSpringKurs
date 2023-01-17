package com.kurss.hotell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RoomController {


    @GetMapping("/rooms")
    public String room (Model model) {
        return "rooms";
    }


}