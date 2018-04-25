package ru.navigator.fuel.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.navigator.fuel.demo.dao.CarRepository;
import ru.navigator.fuel.demo.models.CarModels;

import java.util.List;

@Service
public class CarServices {
    @Autowired
    private CarRepository carRepository;

    public List allCars(){
        return carRepository.findAll();
    }

    public List<CarModels> findCarByBrand(String brand){
        return carRepository.findByBrand(brand);
    }
}
