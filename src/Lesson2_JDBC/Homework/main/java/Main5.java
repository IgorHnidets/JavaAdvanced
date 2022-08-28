import dao.impl.UserDaoImpl;
import models.User;
import services.UserService;
import services.impl.UserServiceImpl1;

import java.sql.SQLException;
import java.util.List;

public class Main5 {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl1(new UserDaoImpl());

        List<User> all = userService.getAll();
        System.out.println(all);
        User carbyId = userService.getbyId(2);
        System.out.println(carbyId);

        User user = new User(0,"Ivan",19,"man");
        userService.save(user);
//        vendorService.delete(0);
//        vendorService.deleteByName("Yura");
        System.out.println(userService.getAll());

    }
}
