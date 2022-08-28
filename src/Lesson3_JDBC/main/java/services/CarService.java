package services;

import models.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();
    Car getbyId(int id);
    void save(Car car);
}
