package com.company;

public class Dog extends Animal {
    private String sound;
    public Dog(int legs, String name, String sound){
        super(legs, name);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


}
