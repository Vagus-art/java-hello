package com.company;

public class Messages {
    private String message1 = "Hello";
    private String message2 = "this is my app";
    private String message3 = "just testing classes and all...";
    public Messages(String mes1, String mes2, String mes3){
        this.message1 = mes1;
        this.message2 = mes2;
        this.message3 = mes3;
    }
    public Messages() {

    }
    public String getAllMessages() {
        return this.message1 + " " + this.message2 + " " + this.message3;
    }
}
