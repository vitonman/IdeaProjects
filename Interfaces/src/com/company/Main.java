package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone vitaphone;
        vitaphone = new DeskPhone(123342);
        vitaphone.powerOn();
        vitaphone.callPhone(123342);
        vitaphone.answer();

        vitaphone = new MobilePhone(124444);
        vitaphone.powerOn();
        vitaphone.callPhone(124444);
        vitaphone.answer();
    }
}
