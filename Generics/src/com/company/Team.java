package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;



    private ArrayList<T> member = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(member.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        }else{
            member.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;

        }
    }


    public int numPlayers(){
        return this.member.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){

        String messsage;

        if(ourScore > theirScore){
            won++;
            messsage = " beat ";
        }else if(ourScore == theirScore){
            tied++;
            messsage = " drew with ";
        }else {
            lost++;
            messsage = " lost to ";
        }
        played++;
        if (opponent != null){
            System.out.println(this.getName() + messsage + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
