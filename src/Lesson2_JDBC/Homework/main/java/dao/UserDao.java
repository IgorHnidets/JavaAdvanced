package dao;

import models.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
public interface UserDao {
    Optional<User> getbyId(int id) throws SQLException;
    List<User> getAll() throws SQLException;
    void save (User user) throws SQLException;
    void remove(int id) throws SQLException;
}
