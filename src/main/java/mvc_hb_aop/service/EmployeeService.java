package mvc_hb_aop.service;

import mvc_hb_aop.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee emp);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
