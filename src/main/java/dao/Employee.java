package dao;

import java.util.List;

public interface Employee {
    List<Employee> all();
    void insert(Employee employee);
}
