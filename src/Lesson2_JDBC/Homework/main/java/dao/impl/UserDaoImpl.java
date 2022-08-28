package dao.impl;

import connections.mySqlConnector11;
import dao.UserDao;
import mappers.CarMapper;
import models.User;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    private final Connection connection;

    public UserDaoImpl(){
        connection = new mySqlConnector11().getConnection();
    }
    @Override
    public Optional<User> getbyId(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from user where id = ?");
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        List<User> users = CarMapper.mapUsersFromResultSet(resultSet);
        User user = null;
        if (users.size()!=0) {
            user = users.get(0);
        }
        statement.close();
        return Optional.ofNullable(user);
    }

    @Override
    public List<User> getAll() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
        List<User> users = CarMapper.mapUsersFromResultSet(resultSet);
        User user = users.get(0);
        statement.close();
        return users;
    }

    @Override
    public void save(User user) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into user(name,age,sex) values (?,?,?)");
        statement.setString(1,user.getName());
        statement.setInt(2,user.getAge());
        statement.setString(3,user.getSex());
        statement.execute();
        statement.close();
    }

    @Override
    public void remove(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("delete from user where id = ?");
        statement.setInt(1,id);
        statement.execute();
        statement.close();

    }
}
