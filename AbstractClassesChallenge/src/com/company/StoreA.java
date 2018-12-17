package com.company;

import java.util.LinkedList;

public abstract class StoreA {
    public String name;
    public LinkedList<String> list;

    public StoreA(String name) {
        this.name = name;
        this.list = new LinkedList<String>();
    }

    public abstract void addInList(String value);
    public abstract void next(LinkedList<String> linkedList);
    public abstract void previous(LinkedList<String> linkedList);
    public abstract void compareTo();
    public abstract void showList(String name);
    public abstract void findList();

    @Override
    public String toString() {
        return "StoreA{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
