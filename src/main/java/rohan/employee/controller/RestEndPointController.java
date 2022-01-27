package rohan.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rohan.employee.model.Employee;
import rohan.employee.service.EmployeeService;

import java.util.List;
import java.util.Optional;

@RestController
public class RestEndPointController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee")
    public List<Employee>getallemp(){
        return employeeService.getallemployee();
    }

    @PostMapping(value = "employee/add")
    public String saveemployee(@RequestBody Employee employee){
        if(employeeService.addemployee(employee)!=null){
            return "Employee Created successfully !!";
        }
        else
            return "Employee Data Not saved !! try again ";
    }

    @DeleteMapping("employee/{id}")
    public String deleteemployeeById(@PathVariable("id") Long id) {
        employeeService.deleteemployee(id);
        return "delete Succesfully !!";
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getemployeeById(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/employee/{id}")
    public String updatemployee(@RequestBody Employee employee){
        if(employeeService.updatemployee(employee)!=null){
            return "Employee Updated successfully !!";
        }
        else
            return "Employee Data Not Found !! try again ";
    }

}
