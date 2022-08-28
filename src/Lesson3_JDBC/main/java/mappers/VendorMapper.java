package mappers;

import models.Car;
import models.Vendor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendorMapper {
    public static List<Vendor> mapVendorsFromResultSet(ResultSet resultSet) throws SQLException {
        List<Vendor> vendors = new ArrayList<>();
        while (resultSet.next()) {
            Vendor vendor = new Vendor(resultSet.getInt(1),
                    resultSet.getString(2)
            );
            vendors.add(vendor);
        }

        return vendors;
    }
}

