package services;

import models.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getbyId(int id);
    void save(User user);
    void remove(int id);
}
