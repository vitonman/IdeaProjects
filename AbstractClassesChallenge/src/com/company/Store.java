package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Store extends StoreA {

    public Store(String name) {
        super(name);
        this.list = new LinkedList<String>();

    }

    @Override
    public void addInList(String value) {
        this.list.add(value);
    }

    @Override
    public void next(LinkedList<String> linkedList) {

    }

    @Override
    public void previous(LinkedList<String> linkedList) {

    }

    @Override
    public void compareTo() {

    }

    @Override
    public void showList(String name) {
        for (int i = 0; i < this.list.size() ; i++) {
            System.out.println(this.list.get(i));
        }
    }

    @Override
    public void findList() {

    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                '}';
    }
}
