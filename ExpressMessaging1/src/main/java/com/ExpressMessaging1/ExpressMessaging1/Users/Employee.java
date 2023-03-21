package com.ExpressMessaging1.ExpressMessaging1.Users;

public class Employee extends Users{

    private String AntiquityCompany;
    private String rh;
    private String employeeType;


    public Employee(String id, String name, String lastName, String celPhone, String email, String address, String city) {
        super(id, name, lastName, celPhone, email, address, city);
    }

    public Employee(String id, String name, String lastName, String celPhone, String email, String address, String city, String antiquityCompany, String rh, String employeeType) {
        super(id, name, lastName, celPhone, email, address, city);
        AntiquityCompany = antiquityCompany;
        this.rh = rh;
        this.employeeType = employeeType;
    }
}
