package ru.navigator.fuel.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.navigator.fuel.demo.models.CarModels;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarModels,Long> {
    public List<CarModels> findByBrand(String brand);
}
