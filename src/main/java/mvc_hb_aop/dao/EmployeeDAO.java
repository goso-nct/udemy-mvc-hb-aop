package mvc_hb_aop.dao;

import mvc_hb_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
    void saveEmployee(Employee emp);
}
