package com.ExpressMessaging1.ExpressMessaging1.Controller;

import com.ExpressMessaging1.ExpressMessaging1.Services.EmployeeServices;
import com.ExpressMessaging1.ExpressMessaging1.Services.ShippingServices;
import com.ExpressMessaging1.ExpressMessaging1.Shipping.Shipping;
import com.ExpressMessaging1.ExpressMessaging1.Users.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ControllerShipping {

    private ShippingServices shippingServices;



    @Autowired
    public void ControllerShipping(ShippingServices shippingServices){this.shippingServices = shippingServices;}

    @PostMapping
    public String crearcreateShipping(@RequestBody Shipping shipping){
        return this.ControllerShipping.crearcreateShipping(Shipping);
    }

    @GetMapping("/{idShipping}")
    public Shipping getShipping(@PathVariable("idShipping") int idShipping){
        return this.ControllerShipping.getShipping(idShipping);
    }

    @PatchMapping
    public void upDateShipping(@RequestBody Shipping Shipping){

    }

    @GetMapping
    public List<Shipping> getStatus(@RequestBody Shipping shippingvio){
       //get shipping filter by status
        return new ArrayList<>();
    }

}
