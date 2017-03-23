package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by ooguro on 2017/03/19.
 */
@Controller
public class HelloController {

    @Autowired
    GameMapper gameMapper;

    @ModelAttribute("hardwareTypes")
    HardwareType[] hardwareTypes() {
        return HardwareType.values();
    }

    @ModelAttribute("newUsedTypes")
    NewUsedType[] newUsedTypes() {
        return NewUsedType.values();
    }

    @ModelAttribute("genreTypes")
    GenreType[] genreTypes() {
        return GenreType.values();
    }

    @ModelAttribute("criteria")
    CriteriaForm criteria() {
        return new CriteriaForm();
    }


    @ModelAttribute("games")
    List<Game> games() {
        return gameMapper.findAll();
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("hello", "Hello World");
        return "hello";
    }

}
