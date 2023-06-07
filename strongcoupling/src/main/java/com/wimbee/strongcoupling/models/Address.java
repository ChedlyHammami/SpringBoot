package com.wimbee.strongcoupling.models;

public class Address {
    private int number;
    private String street;
    private String district;
    public Address() {
        this.street = "Default street";
        this.number = 1000;
        this.district = "Default district";
    }
    
    @Override
    public String toString() {
        return "Adress [number=" + number + ", street=" + street + ", district=" + district + "]";
    }
    
}