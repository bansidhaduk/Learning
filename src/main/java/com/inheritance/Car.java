package com.inheritance;

public class Car extends Vehicle {

    String make = "KIA";

    String model = "Sportage";
    String drive() {
        return make + model;
    }
}