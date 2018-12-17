package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoint;
    private int strenght;
    private String weapon;

    public Player(String name, int hitPoint, int strenght) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strenght = strenght;
        this.weapon = "Sword";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getStrenght() {
        return strenght;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", strenght=" + strenght +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoint);
        values.add(2, "" + this.strenght);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() >0){
            this.name = savedValues.get(0);
            this.hitPoint = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
