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







}
