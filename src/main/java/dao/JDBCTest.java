package dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    private static List<String> getEmployeeNames(){
        List<String> names = new ArrayList<>();
        try{
           DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees.employees LIMIT 15");
            while(resultSet.next()){
                names.add(resultSet.getString("first_name"));
            }
        }catch (SQLException sqlx){
            sqlx.printStackTrace();
        }
        return names;
    }

    public static void main(String[] args) {
        for(String name : getEmployeeNames()){
            System.out.println(name);
        }
    }
}
