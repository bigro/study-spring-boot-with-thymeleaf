package com.example;

import com.example.mapper.GameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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

    @ModelAttribute("games")
    List<Game> games() {
        return gameMapper.findAll();
    }

    @ModelAttribute("gameIds")
    List<String> gameIds() {
        return new ArrayList<>();
    }

    @ModelAttribute("criteria")
    CriteriaForm criteria() {
        CriteriaForm criteriaForm = new CriteriaForm();
        return criteriaForm;
    }

    @RequestMapping("games")
    public String show(Model model) {
        return "games";
    }

    @PostMapping("games")
    public String search(@ModelAttribute("criteria") CriteriaForm criteria, Model model) {
        List<Game> games = gameMapper.findBy(criteria);
        model.addAttribute("games", games);
        model.addAttribute("criteria", criteria);
        return "games";
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.setAllowedFields("hardwareType", "newUsedType", "genres");
//    }

}
