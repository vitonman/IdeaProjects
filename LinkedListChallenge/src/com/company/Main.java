package com.company;


import java.util.ArrayList;
import java.util.LinkedList;

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
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("The gypsy", playList);
        albums.get(0).addToPlayList("Soldier of fortune", playList);



    }

}
