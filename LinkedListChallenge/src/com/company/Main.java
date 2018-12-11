package com.company;


import java.util.*;

public class Main {


    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args){



        Album album = new Album ("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.3);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold On", 4.3);
        album.addSong("The gypsy", 4.3);
        album.addSong("Soldier of fortune", 4.3);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("RRRRasdd", 2.34);
        album.addSong("gggg", 2.34);
        album.addSong("fff", 2.34);
        album.addSong("ddd", 2.34);
        album.addSong("sss", 2.34);
        album.addSong("aaaa", 2.34);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Stormbringer", playList);
        albums.get(0).addToPlayList("The gypsy", playList);
        albums.get(0).addToPlayList("Soldier of fortune", playList);
        albums.get(0).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(6, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist.");
            return;
        }else{
            System.out.println("Now playying " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaing " + listIterator.previous().toString());
                        }else{
                            System.out.println("Where at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying" + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                case 5:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("===============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===============================");
    }



























}
