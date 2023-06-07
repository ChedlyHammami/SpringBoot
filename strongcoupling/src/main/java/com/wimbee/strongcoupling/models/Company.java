package com.wimbee.strongcoupling.models;

public class Company {
    private String name;
    private Address address;
    public Company(String name) {
        this.name = name;
        this.address = new Address();
    }

    @Override
    public String toString() {
        return "Company [name=" + name + ", address=" + address + "]";
    } 
}