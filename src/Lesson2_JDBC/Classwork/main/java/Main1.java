import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();
        List<User3> allusers = getAllUsers(connection);

        User3 user31 = new User3(0, "FROM ", "134", 1000,2010);
        InsertUser(connection,user31);
        connection.close();
    }

    public static void InsertUser(Connection connection, User3 user3) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO car(manufacturer,model,model_year,price) VALUES (?, ?, ?, ?)");
        statement.setString(1, user3.getManufacturer());
        statement.setString(2, user3.getModel());
        statement.setInt(3,user3.getPrice());
        statement.setInt(4, user3.getModel_year());
        statement.execute();
        statement.close();
    }

    public static List<User3> getAllUsers(Connection connection) throws SQLException {

        if (connection == null) {
            throw new RuntimeException("Connection is null");
        }
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from car");

        List<User3> user3s = new ArrayList<>();
        while (resultSet.next()) {
            User3 user3 = new User3();
            user3.setId(resultSet.getInt(1));
            user3.setManufacturer(resultSet.getString(2));
            user3.setModel(resultSet.getString(3));
            user3.setPrice(resultSet.getInt(6));
            user3.setModel_year(resultSet.getInt(5));
            user3s.add(user3);
        }
        System.out.println(user3s);
        statement.close();
        return user3s;
    }

    public static Connection getConnection() {
        Connection connection = null;
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        String USER = "root";
        String PASSWORD = "1111";
        String JDBC_URL = "jdbc:mysql://localhost:3306/car_info?serverTimezone=UTC";

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
