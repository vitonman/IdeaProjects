package com.company;

import java.util.ArrayList;

public class Data {

    ArrayList<Album> albums;

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

    public boolean listSong(Album albumName){
        if(albumName!=null){
            System.out.println("List of songs of " + albumName.getAlbum_name() + " album:");
            ArrayList<Song> albumSongs = albumName.getSongs();
            for (int i = 0; i < albumSongs.size(); i++) {
                Song albumSong = albumSongs.get(i);
                System.out.println(" Song : " + albumSong.getSong_name() + ", duration " + albumSong.getDuration());
            }
            System.out.println("********* D O N E *********");
            return true;
        }else{
            System.out.println("No album:"+ albumName + " in list");
            return false;
        }
    }

    public boolean addToPlaylist(Album albumName){
        if(albumName!=null){
            System.out.println("List of songs of " + albumName.getAlbum_name() + " album:");
            ArrayList<Song> albumSongs = albumName.getSongs();
            Player player = new Player();
            for (int i = 0; i < albumSongs.size(); i++) {
                Song albumSong = albumSongs.get(i);
                player.addSong(albumSong.getSong_name(),albumSong.getDuration());
                System.out.println(" Song : " + albumSong.getSong_name() + ", duration " + albumSong.getDuration());
            }
            System.out.println("********* A D D E D *********");
            return true;
        }else{
            System.out.println("No album:"+ albumName + " in list");
            return false;
        }
    }

}
