package com.inheritance;

public class Employee extends Person{
    double salary = 10000;
    String firstName = "Bansi";

    String lastName = "Dhaduk";

    String getSalary() {
        return firstName + lastName +" : "+ salary;
    }
}
