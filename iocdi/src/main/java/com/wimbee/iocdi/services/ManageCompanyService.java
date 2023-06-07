package com.wimbee.iocdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wimbee.iocdi.models.IAddress;
import com.wimbee.iocdi.models.ICompany;

@Component
public class ManageCompanyService implements CommandLineRunner{
    @Autowired
    private ICompany company;
    @Autowired
    @Qualifier("IAddressIMPLV2")
    private IAddress address;


    public void createCompany(ICompany company,IAddress address){
        company.setName("My Company");
        address.setNumber(1000);
        address.setStreet("Default street");
        address.setDistrict("Default district");
        company.setAddress(address);
    }
    @Override
    public void run(String... args) throws Exception {
        this.createCompany(company, address);
        System.out.println(company);
    }
    
}