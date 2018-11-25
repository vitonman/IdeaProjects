package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer factory = new Printer(50, false);
        System.out.println("initial page count = " + factory.getPagePrinted());
        int pagesPrinted = factory.printPages(4);
        System.out.println("Pages printed was" + pagesPrinted + " new total print count = " + factory.getPagePrinted());
        pagesPrinted = factory.printPages(2);
        System.out.println("Pages printed was" + pagesPrinted + " new total print count = " + factory.getPagePrinted());


    }
}
