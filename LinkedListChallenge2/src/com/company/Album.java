package com.company;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;
    private String album_name;

    public Album(String title) {
        this.album_name = title;
        this.songs = new ArrayList<Song>();
    }

    public String getAlbum_name() {
        return album_name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String songTitle, double duration){
        if(findSong(songTitle) == null){
            this.songs.add(new Song(songTitle, duration));
            System.out.println("The " + songTitle + " is added ");
            return true;
        }
        System.out.println("Something wrong with add song.");
        return false;
    }

    private Song findSong(String songTitle){
        for (int i = 0; i < this.songs.size(); i++) {
            Song checkedSong = this.songs.get(i);
            if(checkedSong.getSong_name().equals(songTitle)){
                return checkedSong;
            }
        }
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
