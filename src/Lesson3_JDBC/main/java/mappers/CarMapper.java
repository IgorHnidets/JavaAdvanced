package mappers;

import models.Car;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.List;

public class CarMapper {
    public static List<Car> mapCarsFromResultSet(ResultSet resultSet) throws SQLException{
        List<Car>  cars = new ArrayList<>();
        while (resultSet.next()){
            Car car = new Car(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(5),
                    resultSet.getInt(6)
            );
            cars.add(car);
        }

        return cars;
    }

}
