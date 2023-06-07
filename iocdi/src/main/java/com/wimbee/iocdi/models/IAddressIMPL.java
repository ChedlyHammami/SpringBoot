package com.wimbee.iocdi.models;

import org.springframework.stereotype.Component;

@Component
public class IAddressIMPL implements IAddress{
    private int number;
    private String street;
    private String district;

    public IAddressIMPL(){

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
    public void setDistrict(String district){
        this.district = district;
    }
    @Override
    public String toString() {
        return "IAddressIMPL [number=" + number + ", street=" + street + ", district=" + district + "]";
    }
    
}