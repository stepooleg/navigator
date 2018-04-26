package ru.navigator.fuel.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.navigator.fuel.demo.models.CarModels;
import ru.navigator.fuel.demo.services.CarServices;

import java.util.List;
@RestController
public class CarController {
    @Autowired
    CarServices carServices;
    @GetMapping("/cars")
    public List<CarModels> findAll(){
        return carServices.allCars();
    }
    @GetMapping("/car/{brand}")
    public List<CarModels> oneCar(@PathVariable String brand){
        return carServices.findCarByBrand(brand);
    }
}
