package rohan.employee.service;

import rohan.employee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getallemployee();
    Employee addemployee(Employee employee);
    Employee updatemployee(Employee employee);
    void deleteemployee(Long id);
    Optional<Employee> getEmployeeById(Long id);
}
