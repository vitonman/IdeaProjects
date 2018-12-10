package com.company;

import java.util.ArrayList;

public class Main {
    ArrayList<Album> albums;

    public static void main(String[] args) {
	// write your code here
        Album album = new Album("POP");
        album.getAlbum_name();
        album.addSong("song1", 2.55);
        album.addSong("song2", 2.13);
        album.addSong("song3", 2.21);
        album.addSong("song4", 2.87);
        album.addToPlaylist(album);

    }


    public boolean addAlbum(String albumName){
        if(findAlbum(albumName) == null){
            this.albums.add(new Album(albumName));
            System.out.println("The " + albumName + " album is succefuly added.");
            return true;
        }
        System.out.println("Something wrong with add album");
        return false;
    }

    private Album findAlbum(String albumName){
        for (int i = 0; i < this.albums.size(); i++) {
            Album checkedAlbum = this.albums.get(i);
            if (checkedAlbum.getAlbum_name().equals(albumName)){
                System.out.println("Album " + checkedAlbum + " was found.");
                return checkedAlbum;
            }
        }
        System.out.println("Error with returning findAlbum");
        return null;
    }

//    public boolean addToPlaylist(String albumName){
//        if(findAlbum(albumName) == null){
//            for (int i = 0; i < this.albums.size(); i++) {
//                Album checkedAlbum = this.albums.get(i);
//                this.songs.add(new Player(checkedAlbum));
//            }
//        }
//        System.out.println("Something wrong with add song.");
//        return false;
//    }

}
