package com.company;

public class Printer {
    private int toner_level; //percent %
    private int pagePrinted;
    private boolean duplex;

    public Printer(int toner_level, boolean duplex) {
        if(toner_level > -1 && toner_level <= 100){
            this.toner_level = toner_level;
        }else{
            this.toner_level = -1;
        }
        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount <= 100){
            if(this.toner_level + tonerAmount > 100){
                return -1;
            }
            this.toner_level += tonerAmount;
            return this.toner_level;
        }else{
            return -1;
        }

    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing duplex mode");
        }
        this.pagePrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
