package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> albums;

        Song song1 = new Song("Stopp", 2.55);
        Song song2 = new Song("Sunshine", 2.55);
        Song song3 = new Song("Last day", 2.55);
        Song song4 = new Song("Ochi", 2.55);
        Song song5 = new Song("Yestarday", 2.55);

        song1.getName();

        Album album = new Album();

        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()


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

    }
}
