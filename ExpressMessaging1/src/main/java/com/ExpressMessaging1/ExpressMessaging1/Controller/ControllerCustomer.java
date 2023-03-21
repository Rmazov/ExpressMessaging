package com.ExpressMessaging1.ExpressMessaging1.Controller;

import com.ExpressMessaging1.ExpressMessaging1.Services.CustomerServices;
import com.ExpressMessaging1.ExpressMessaging1.Users.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ControllerCustomer {
    CustomerServices customerServices;

    @Autowired
    public void CustomerServices(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }


    @PostMapping("create/customer")
    public void createCustomer(@RequestBody Customer customer) {
        return this.CustomerServices.createCustomer(customer);

    }

    @PatchMapping("update/customer")
    public void upDateCustomer(@RequestBody Customer customer) {
        return this.CustomerServices.upDateCustomer(customer);

    }
   @DeleteMapping("delete/{id}")
    public void deleteCustomer(@PathVariable ("Id") int id) {
        return this.CustomerServices.deleteCustomer(id);

    }

    @GetMapping("get/{id}")
    public void getCustomer(@RequestBody Customer customer) {
        return this.CustomerServices.getCustomer(customer);

    }

}
