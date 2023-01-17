package com.kurss.hotell.controllers;

import com.kurss.hotell.models.Book;
import com.kurss.hotell.models.Post;
import com.kurss.hotell.models.UserEntity;
import com.kurss.hotell.repo.BookRepository;
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
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/book")
    public String book (Model model) {
        UsernamePasswordAuthenticationToken userAuth = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        String userName = userAuth.getName();
        Optional<UserEntity> userOptional = userRepository.findById(userName);
        model.addAttribute("user", userOptional.get());

        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books",books);
        return "book";
    }

    @PostMapping("/book")
    public String bookAdd (@RequestParam String data_in, @RequestParam String data_out, @RequestParam String room, @RequestParam String name_book, Model model){
        Book book = new Book(data_in,data_out,room,name_book);
        bookRepository.save(book);
        return "redirect:/user";
    }

}
