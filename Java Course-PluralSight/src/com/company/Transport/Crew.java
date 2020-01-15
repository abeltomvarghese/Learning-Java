package com.company.Transport;

public class Crew extends Person{
    private int yearsOfExperience = 0;
    public Crew (String name, int years){
        super(name);
        this.yearsOfExperience = years;
    }

}
