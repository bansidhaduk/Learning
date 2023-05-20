package com.inheritance;

public class Truck extends Vehicle {

    String make = "FORD";

    String model = "F150";
    String drive() {
        return make + model;
    }
}
