package com.example.loosecoupling.models;

public class CompanyIMPL implements ICompany{
    private String name;
    private IAddress address;
    

    public CompanyIMPL() {
        
    }

    @Override
    public void setAddress(IAddress address) {
       this.address = address;
    }

    @Override
    public void setName(String name) {
       this.name = name;
    }
    @Override 
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString() {
        return "CompanyIMPL [name=" + name + ", address=" + address + "]";
    }

    @Override
    public IAddress getAddress() {
        return this.address;    
    }
    
    
}