package com.certification.jokesapp.controller;

import com.certification.jokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeServiceImpl;

    public JokeController(JokeService jokeServiceImpl) {
        this.jokeServiceImpl = jokeServiceImpl;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokeServiceImpl.getJoke());
        return "chucknorris";
    }
}
