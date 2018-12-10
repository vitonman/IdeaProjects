package com.company;

import java.util.LinkedList;

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



}
