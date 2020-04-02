package com.company;

public class Cat extends Animal {
    public Cat(int legs, String name){
        super(legs,name);
        System.out.println(this.name + " doesn't want to talk to you");
    }
}
