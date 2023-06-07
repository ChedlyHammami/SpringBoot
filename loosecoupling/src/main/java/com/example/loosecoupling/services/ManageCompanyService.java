package com.example.loosecoupling.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.loosecoupling.models.AddressIMPL;
import com.example.loosecoupling.models.AddressIMPLV2;
import com.example.loosecoupling.models.CompanyIMPL;
import com.example.loosecoupling.models.ICompany;

@Component
public class ManageCompanyService implements CommandLineRunner{
    private ICompany compony = new CompanyIMPL();

    public void createCompany(ICompany company){
        this.compony.setName(company.getName());
        this.compony.setAddress(company.getAddress());
    }
    @Override
    public void run(String... args) throws Exception {
        ICompany c = new CompanyIMPL();
        c.setAddress(new AddressIMPL());
        c.setName("My Company");
        this.createCompany(c);
        System.out.println(this.compony);

        System.out.println("-------------------------------------");

        ICompany co = new CompanyIMPL();
        co.setAddress(new AddressIMPLV2());
        co.setName("My Company 2");
        this.createCompany(co);
        System.out.println(this.compony);
    }
    
}