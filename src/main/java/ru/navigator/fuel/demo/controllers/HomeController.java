package ru.navigator.fuel.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.navigator.fuel.demo.dao.CarRepository;
import ru.navigator.fuel.demo.models.CarModels;
import ru.navigator.fuel.demo.services.CarServices;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private CarServices carServices;

    @GetMapping("/")
    public String index (){
        return "index";
    }

}
