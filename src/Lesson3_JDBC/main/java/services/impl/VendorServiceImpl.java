package services.impl;

import dao.VendorDao;
import models.Vendor;
import services.VendorService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendorServiceImpl implements VendorService {
    private final VendorDao vendorDao;

    public VendorServiceImpl(VendorDao vendorDao) {
        this.vendorDao = vendorDao;
    }

    @Override
    public void save(Vendor vendor) {
       try {
           vendorDao.save(vendor);
       } catch (SQLException e){
           e.printStackTrace();
       }
    }

    @Override
    public List<Vendor> getAll() {
        List<Vendor> all = new ArrayList<>() ;
        try {
            all =  vendorDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }

    @Override
    public void delete(int id) {
        try {
            vendorDao.remove(id);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByName(String name) {
        try {
            vendorDao.removebyName(name);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
