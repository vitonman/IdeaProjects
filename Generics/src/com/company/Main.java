package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        //items.add("tim");
//        items.add(4);
//        items.add(5);
//        items.add(6);
//
//        printDoubled(items);
//
//    }
//
//    private static void printDoubled(ArrayList<Integer> n){
//        for(int i : n){
//            System.out.println(i * 2);
//        }
//    }

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer backgam = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(backgam);
        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<String> brokenTeam = new Team<>("this wonr work");
        brokenTeam.addPlayer("no-one");
    }
}
