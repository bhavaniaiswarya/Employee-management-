import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*") // Allows front-end to connect
public class EmployeeController {

    private List<Employee> employees = new ArrayList<>();

    // Initial dummy data
    public EmployeeController() {
        employees.add(new Employee("John Doe", "Engineering", 75000));
        employees.add(new Employee("Jane Smith", "Marketing", 60000));
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return employee;
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                employee.setName(updatedEmployee.getName());
                employee.setDepartment(updatedEmployee.getDepartment());
                employee.setSalary(updatedEmployee.getSalary());
                return employee;
            }
        }
        return null; // Employee not found
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }
}