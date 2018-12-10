package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Data data = new Data();
        Album album = new Album("POP");
        album.getAlbum_name();
        album.addSong("song1", 2.55);
        album.addSong("song2", 2.13);
        album.addSong("song3", 2.21);
        album.addSong("song4", 2.87);

        Album album2 = new Album("ROCK");
        album.getAlbum_name();
        album.addSong("song1", 2.55);
        album.addSong("song2", 2.13);
        album.addSong("song3", 2.21);
        album.addSong("song4", 2.87);

        data.addToPlaylist(album2);
        data.listSong(album2);

    }


}
