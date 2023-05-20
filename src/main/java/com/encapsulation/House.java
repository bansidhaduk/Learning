package com.encapsulation;

public class House {
    private String address;
    private double squareFootage;
    private int numRooms;

    public House(String address, double squareFootage, int numRooms) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.numRooms = numRooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSquareFootage() {
            return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        if(squareFootage > 0) {
            this.squareFootage = squareFootage;
        }
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        if(numRooms > 0) {
            this.numRooms = numRooms;
        }
    }
}
