package ru.navigator.fuel.demo.dao;

import org.springframework.data.repository.CrudRepository;
import ru.navigator.fuel.demo.models.CarModels;

public interface CarRepository extends CrudRepository<CarModels,Long> {
}
