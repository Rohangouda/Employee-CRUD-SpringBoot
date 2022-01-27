package rohan.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rohan.employee.model.Employee;
import rohan.employee.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getallemployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addemployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public Employee updatemployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public void deleteemployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
       return employeeRepository.findById(id);
    }
}
