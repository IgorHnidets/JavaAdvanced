import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();
        List<User2> allusers = getConnection();

        User2 user2 = new User2();
        insertUser(connection);
        connection.close();}
    public static void SnsertUser(Connection connection, User2 user2) throws SQLException{


        if (connection == null){
            throw new RuntimeException("Connection is null");
            }
        Statement statement = connection.createStatement();
        ResultSet resultSet =  statement.executeQuery("select*from user");
        User2 user = new User();
        List<User2> user2s = new ArrayList<>();
        while (resultSet.next()){
            User2 user2 = new User2();
            user.setId();
//            .....
            System.out.println(user);
        }

        System.out.println( user);
        statement.close();
        connection.close();
    }

    public static void insertUser(Connection connection) {
        connection.prepareStatement("INSERT INTO user() VALUES ("+ ")");
        sta..//
    }
    public static Connection getConnection(){
        Connection connection = null;
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        String USER = "root";
        String PASSWORD = "root";
        String DDBC_URL = "jdbc.mysql://localhost:3306/web_project?";

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            DriverManager.getConnection(DDBC_URL,USER,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}