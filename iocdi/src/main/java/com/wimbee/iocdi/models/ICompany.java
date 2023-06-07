package com.wimbee.iocdi.models;

public interface ICompany {
    void setName(String name);
    void setAddress(IAddress address);
    String toString();
}