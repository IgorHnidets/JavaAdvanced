package services.impl;

import dao.UserDao;
import models.User;
import services.UserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl1 implements UserService {
    private UserDao userDao;

    public UserServiceImpl1(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        List<User> all = new ArrayList<>() ;
        try {
           all =  userDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }

    @Override
    public User getbyId(int id) {
        try {
           Optional<User> getbyId = userDao.getbyId(id);
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
    public void save(User user) {
        try {
            userDao.save(user);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            userDao.remove(id);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
