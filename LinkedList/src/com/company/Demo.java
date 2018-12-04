package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeTovisit = new LinkedList<String>();
        placeTovisit.add("Tartu");
        placeTovisit.add("Tallinn");
        placeTovisit.add("Jõhvi");
        placeTovisit.add("Parnu");
        placeTovisit.add("Narva");
        placeTovisit.add("Võru");

        printList(placeTovisit);

        placeTovisit.add(1, "Alice Springs");
        printList(placeTovisit);

        placeTovisit.remove(4);
        printList(placeTovisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if( comparison>0){
                // new City should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0 ){
                //move to on next city

            }

        }
        stringListIterator.add(newCity);
        return true;
    }















}
