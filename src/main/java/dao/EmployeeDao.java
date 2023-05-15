package dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao implements Employee {
    private Connection connection;

    public EmployeeDao(){
       try{
           DriverManager.registerDriver(new Driver());
          connection = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/bigfoot_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                   "root",
                   "codeup"
           );
       }catch (SQLException sqlx){
          throw new RuntimeException("Error connecting to the database!", sqlx);
       }
    }
    @Override
    public List<Employee> all() {
         List<Employee> employees = new ArrayList<>();
       try{
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM employees.employees LIMIT 15");
           while(resultSet.next()){
               models.Employee employee = new models.Employee(
                       resultSet.getLong("id"),
                       resultSet.getString("first_name"),
                       resultSet.getString("last_name"),
                       resultSet.getString("gender")
               );
               employees.add((Employee) employee);
           }
       }catch (SQLException sqlx){
           throw new RuntimeException("Error retrieving all employees.", sqlx);
       }
         return employees;
    }

    @Override
    public void insert(Employee employee) {

    }
}
