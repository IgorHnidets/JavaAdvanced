package dao;

import models.Vendor;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public interface VendorDao {
    void save(Vendor vendor) throws SQLException;

    List<Vendor> getAll() throws SQLException;
    void remove(int id) throws SQLException;
}
