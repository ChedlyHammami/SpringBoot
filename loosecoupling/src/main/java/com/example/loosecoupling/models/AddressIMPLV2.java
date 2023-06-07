package com.example.loosecoupling.models;

public class AddressIMPLV2 implements IAddress{
    private int number;
    private String street;
    private String district;
    
    public AddressIMPLV2() {
        this.number = 1000;
        this.street = "Default street";
        this.district = "Default district";
    }

    @Override
    public void setNumber(int number) {
       this.number = number;
    }

    @Override
    public void setStreet(String street) {
       this.street = street;
    }

    @Override
    public void setDistrict(String district) {
       this.district = district;
    }

    @Override
    public String toString() {
        return "AddressIMPL [number=" + number + ", street=" + street + ", district=" + district +", country= Tunisia"+"]";
    }
}