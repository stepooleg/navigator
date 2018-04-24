package ru.navigator.fuel.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.navigator.fuel.demo.dao.CarRepository;
import ru.navigator.fuel.demo.models.CarModels;

import java.util.Map;

@Controller
public class CarsControllers {
    @Autowired
    private CarRepository carRepository;
    @GetMapping("/")
    public String homeView (){
        return "index";
    }
    @GetMapping("/count")
    public String findAll(Map<String,Object> model){
        Iterable<CarModels> messages = carRepository.findAll();
        model.put("messages",messages);
        return "count";

    }
}
