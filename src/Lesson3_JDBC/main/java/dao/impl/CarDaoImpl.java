//package dao.impl;
//
//import dao.CarDao;
//import mappers.CarMapper;
//import connections.mySqlConnector11;
//import models.Car;
//
//import java.sql.*;
//import java.util.List;
//import java.util.Optional;
//
//public class CarDaoImpl implements CarDao {
//    private final Connection connection;
//
//    public CarDaoImpl(){
//        connection = new mySqlConnector11().getConnection();
//    }
//    @Override
//    public Optional<Car> getbyId(int id) throws SQLException {
//        PreparedStatement statement = connection.prepareStatement("select * from car where id = ?");
//        statement.setInt(1,id);
//        ResultSet resultSet = statement.executeQuery();
//        List<Car> cars = CarMapper.mapCarsFromResultSet(resultSet);
//        Car car = null;
//        if (cars.size()!=0) {
//            car = cars.get(0);
//        }
//        statement.close();
//        return Optional.ofNullable(car);
//    }
//
//    @Override
//    public List<Car> getAll() throws SQLException {
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from car");
//        List<Car> cars = CarMapper.mapCarsFromResultSet(resultSet);
//        Car car = cars.get(0);
//        statement.close();
//        return cars;
//    }
//
//    @Override
//    public void save(Car car) {
//
//    }
//
//    @Override
//    public void remove(int id) {
//
//    }
//}
