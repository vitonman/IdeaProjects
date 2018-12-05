package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> playList = new LinkedList<String>();
        Data data = new Data();
        data.addAlbum("Rock");
        data.addSong("Rock", "Never get alone", 2.12);
        data.printAlbumData();
        data.listSong("Rock");
        data.addAlbum("Pop");

        addInPlaylist(playList, "Never get alone");





        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist
        // and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist,
        // create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.
        // Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist
        // (so you can only play songs tha you own).


// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

        //TODO
        //MAIN CLASS IS PLAYLIST
        //Album class(albums) stored here in arrayList
        //Songs can be added to playlist from different albums
        //Menu option(quit, skip forward, backward, replay current.
        //LIST OF SONGS IN PLAYLIST
        //SONG MUST EXIST IN ALBUM BEFORE IT CAN BE ADDET TO PLAYLIST

        //SO HERE WITH LINKED LIST (delete, remove, modify)

    }

    private static boolean addInPlaylist(LinkedList<String> playList, String newSong){
        ListIterator<String> stringListIterator = playList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newSong);
            if(comparison == 0){
                System.out.println(newSong + " is already in your playlist.");
                return false;
            }else if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newSong);
                return true;
            }else if(comparison < 0){
                //move to next song
            }
        }
        stringListIterator.add(newSong);
        return true;
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Song: " + i.next());
        }
        System.out.println("======================");
    }


    private static void playing(LinkedList songs){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = songs.listIterator();

        if(songs.isEmpty()){
            System.out.println("No songs in your playlist.");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    //quit
                    break;
                case 1:
                    //forward
                    break;
                case 2:
                    //backward
                    break;
                case 3:
                    //replay
                    break;
            }





        }
    }

























}
