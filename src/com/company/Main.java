package com.company;

public class Main {


    public static void main(String[] args) {
	    System.out.println("hello world");
        Messages defMessages = new Messages();
        Messages myMessages = new Messages("mensaje 1", "mensaje 2", "mensaje 3");
        System.out.println(defMessages.getAllMessages());
        System.out.println(myMessages.getAllMessages());



        Dog Fluffy = new Dog(4, "Fluffy","woof!");
        Cat Dart = new Cat(4,"Dart");
        System.out.println(Dart.getName());
        System.out.println(Fluffy.getName());
        System.out.println(Fluffy.getSound());

    }


}
