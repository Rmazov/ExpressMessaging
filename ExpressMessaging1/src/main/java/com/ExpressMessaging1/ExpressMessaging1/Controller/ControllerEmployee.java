package com.ExpressMessaging1.ExpressMessaging1.Controller;

import com.ExpressMessaging1.ExpressMessaging1.Users.Employee;
import com.ExpressMessaging1.ExpressMessaging1.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ControllerEmployee {
    private EmployeeServices employeeServices;



    @Autowired
    public void ControllerEmployee(EmployeeServices employeeServices){this.employeeServices = employeeServices;}

    @GetMapping("/getEmployee/{cedula}")
    public List<Employee> getEmployee(){
        return this.employeeServices.getEmployee();
    }

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        return this.employeeServices.createEmployee(employee);

    }


    @PatchMapping("/upDateEmployee/{cedula}")
    public Employee upDateEmployee(@RequestBody Employee employee){
        return this.employeeServices.upDateEmployee(employee);

    }

    @DeleteMapping("/deleteEmployee")
    public Employee deleteEmployee(@RequestBody Employee employee){
        return this.employeeServices.deleteEmployee(employee);

    }


}
