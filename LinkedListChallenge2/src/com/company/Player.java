package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Player {
    private LinkedList<Song> playlist_songs;

    public Player() {
        this.playlist_songs = new LinkedList<Song>();
    }

    public boolean addSong(String songTitle, double duration){
        if(findSong(songTitle) == null){
            this.playlist_songs.add(new Song(songTitle, duration));
            System.out.println("The " + songTitle + " is added to playlist");
            return true;
        }
        System.out.println("Something wrong with add song.");
        return false;
    }

    private Song findSong(String songTitle){
        for (int i = 0; i < this.playlist_songs.size(); i++) {
            Song checkedSong = this.playlist_songs.get(i);
            if(checkedSong.getSong_name().equals(songTitle)){
                System.out.println("Song " + checkedSong + " was found.");
                return checkedSong;
            }
        }
        return null;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No songs iterator");
            return;
        }else{
            System.out.println("Now listening " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday Vacation over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now listening " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the playlist.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now listening " + listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }

        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - to next city\n" +
                "2 - to previous city\n" +
                "3 - to print menu options");
    }



}
