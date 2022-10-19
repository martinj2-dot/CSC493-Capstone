package com.joey.PaperTrader.controller;
import com.joey.PaperTrader.model.User;
import com.joey.PaperTrader.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RouteController {
    private final UserRepository userRepository;

    @Autowired
    public RouteController(UserRepository userRepository){
        this.userRepository = userRepository;

    }
    @RequestMapping(path = "/landing")
    public String getUser(){

        return "landing";
    }
    @RequestMapping(path= "/login")
    public List<User> saveUser(){

        return null;
    }
}

