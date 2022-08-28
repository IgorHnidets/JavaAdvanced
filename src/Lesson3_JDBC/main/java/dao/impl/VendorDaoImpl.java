package dao.impl;

import connections.mySqlConnector;
import dao.VendorDao;
import mappers.CarMapper;
import mappers.VendorMapper;
import models.Car;
import models.Vendor;

import java.sql.*;
import java.util.List;

public class VendorDaoImpl implements VendorDao {

    private final Connection connection;

    public VendorDaoImpl() {
        connection = new mySqlConnector().getConnection();
    }

    @Override
    public void save(Vendor vendor) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into vendors( name) VALUES (?)");
    statement.setString(1, vendor.getName());
    statement.execute();
    statement.close();
    }

    @Override
    public List<Vendor> getAll() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from  vendors");
        List<Vendor> vendors = VendorMapper.mapVendorsFromResultSet(resultSet);
        Vendor vendor = vendors.get(0);
        statement.close();
        return vendors;
    }

    @Override
    public void remove(int id) throws SQLException {
            PreparedStatement statement = connection
        .prepareStatement("delete from vendors where id = ?");
            statement.setInt(1,id);
            statement.execute();
            statement.close();
    }
}
