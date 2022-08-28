package mappers;

import models.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarMapper {
    public static List<User> mapUsersFromResultSet(ResultSet resultSet) throws SQLException{
        List<User>  users = new ArrayList<>();
        while (resultSet.next()){
            User user = new User(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getInt(3),
                    resultSet.getString(4)
            );
            users.add(user);
        }

        return users;
    }

}
