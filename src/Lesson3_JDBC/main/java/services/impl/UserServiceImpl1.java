//package services.impl;
//
//
//import models.Car;
//import services.CarService;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class CarServiceImpl1 implements CarService {
//    private CarDao carDao;
//
//    public UserServiceImpl1(CarDao carDao) {
//        this.carDao = CarDao;
//    }
//
//    @Override
//    public List<Car> getAll() {
//        List<Car> all = new ArrayList<>() ;
//        try {
//           all =  carDao.getAll();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return all;
//    }
//
//    @Override
//    public Car getbyId(int id) {
//        try {
//           Optional<Car> getbyId = carDao.getbyId(id);
//           if (getbyId.isPresent()){
//               return getbyId.get();
//           }
//            throw new RuntimeException("User not found");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public void save(Car user) {
//        try {
//            carDao.save(user);
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void remove(int id) {
//        try {
//            carDao.remove(id);
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//}
