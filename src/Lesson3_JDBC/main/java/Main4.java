import dao.impl.CarDaoImpl;
import dao.impl.VendorDaoImpl;
import models.Car;
import models.Vendor;
import services.CarService;
import services.VendorService;
import services.impl.CarServiceImpl;
import services.impl.VendorServiceImpl;


import java.sql.SQLException;
import java.util.List;

public class Main4 {
    public static void main(String[] args) throws SQLException {
        CarService carService = new CarServiceImpl(new CarDaoImpl());

//        List<Car> all = carService.getAll();
//        System.out.println(all);
//        Car carbyId = carService.getbyId(9);
//        System.out.println(carbyId);

        VendorService vendorService = new VendorServiceImpl(new VendorDaoImpl());
//        Vendor vendor = new Vendor(0,"Igoe K");
//        vendorService.save(vendor);
//        vendorService.delete(0);
        System.out.println(vendorService.getAll());

    }
}
