package com.ExpressMessaging1.ExpressMessaging1.Services;

import com.ExpressMessaging1.ExpressMessaging1.Users.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServices {

private List<Employee> employees;

    public EmployeeServices() {
        this.employees = new ArrayList<>();
    }




    public List<Employee> getEmployee(){
        return this.employees;
    }

    public Employee createEmployee(Employee employee){
        this.employees.add(employee);
        return employee;
    }

}
