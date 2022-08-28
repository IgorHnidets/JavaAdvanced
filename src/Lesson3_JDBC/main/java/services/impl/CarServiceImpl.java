package services.impl;

import dao.CarDao;
import models.Car;
import services.CarService;

import java.sql.SQLException;
import java.util.*;

public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAll() {
        List<Car> all = new ArrayList<>() ;
        try {
           all =  carDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }

    @Override
    public Car getbyId(int id) {
        try {
           Optional<Car> getbyId = carDao.getbyId(id);
           if (getbyId.isPresent()){
               return getbyId.get();
           }
            throw new RuntimeException("User not found");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(Car car) {

    }
}
