package ru.navigator.fuel.demo.models;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class CarModels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String brand;
    private String model;
    private Integer year;
    private String engine;
    private Long fuel_consumption;
    private String fuel_type;

    public CarModels(int id, String brand, String model, Integer year,
                     String engine, Long fuel_consumption, String fuel_type) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.fuel_consumption = fuel_consumption;
        this.fuel_type = fuel_type;
    }

    public CarModels() {
    }

    public String getCarMake() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public String getCarBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    public Long getFuel_consumption() {
        return fuel_consumption;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setCarMake(String carMake) {
        carMake = brand;
    }

    public void setModel(String model) {
        model = model;
    }

    public void setYear(Integer year) {
       year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCarBrand(String carBrand) {
        this.brand = carBrand;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setFuel_consumption(Long fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }
}
