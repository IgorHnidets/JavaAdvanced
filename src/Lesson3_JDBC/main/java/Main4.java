import dao.impl.UserDaoImpl;
import dao.impl.VendorDaoImpl;
import models.Vendor;
import services.UserService;
import services.VendorService;
import services.impl.UserServiceImpl1;
import services.impl.VendorServiceImpl;


import java.sql.SQLException;

public class Main4 {
    public static void main(String[] args) throws SQLException {
//        CarService carService = new CarServiceImpl1(new CarDaoImpl());
//
//        List<Car> all = carService.getAll();
//        System.out.println(all);
//        Car carbyId = carService.getbyId(9);
//        System.out.println(carbyId);

        VendorService vendorService = new VendorServiceImpl(new VendorDaoImpl());
//        Vendor vendor = new Vendor(0,"Yura");
//        vendorService.save(vendor);
//        vendorService.delete(0);
//        vendorService.deleteByName("Yura");
        System.out.println(vendorService.getAll());

    }
}
