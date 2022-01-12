package mvc_hb_aop.controller;

import mvc_hb_aop.entity.Employee;
import mvc_hb_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all_employees";
    }

    @RequestMapping("addEmployee")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("emp", employee);
        return "emp_info";
    }

    @RequestMapping("saveEmployee")
    public String saveEmployee(@ModelAttribute("emp") Employee emp) {
        employeeService.saveEmployee(emp);
        return "redirect:/";
    }

    @RequestMapping("updateEmployee")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("emp", employee);
        return "emp_info";
    }
}
