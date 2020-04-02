package com.company;

public class Animal {

    protected int legs;
    protected String name;

    public Animal(int legs, String name){
        this.legs = legs;
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
