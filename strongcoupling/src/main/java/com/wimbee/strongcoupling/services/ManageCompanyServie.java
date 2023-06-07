package com.wimbee.strongcoupling.services;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wimbee.strongcoupling.models.Company;

@Component
public class ManageCompanyServie implements CommandLineRunner{
    private Company company;

    public void createCompany(){
        company = new Company("My company");
    }

    @Override
    public void run(String... args) throws Exception {
        this.createCompany();    
        System.out.println(this.company);
    }
}