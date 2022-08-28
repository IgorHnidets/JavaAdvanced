package services;

import models.Vendor;

import java.sql.SQLException;
import java.util.List;

public interface VendorService {
    void save(Vendor vendor) throws SQLException;
    List<Vendor> getAll();
    void delete(int id);
}
