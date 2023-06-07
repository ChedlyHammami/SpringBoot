package com.wimbee.iocdi.models;

import org.springframework.stereotype.Component;

@Component
public class CompanyIMPL implements ICompany{

    private String name;
    private IAddress address;

    
    public CompanyIMPL() {
        
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAddress(IAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CompanyIMPL [name=" + name + ", address=" + address + "]";
    }
    
}