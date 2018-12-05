package com.company;



import java.util.ArrayList;

public class Album {

    private String albumName;
    private ArrayList<Song> songs;


    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<Song>();

    }

    public String getAlbumName() {
        return albumName;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }

    //adding song if song is not exist
    public boolean addSong(String songName, double duration){
        if(findSong(songName)==null){
            this.songs.add(new Song(songName,duration));
            return true;
        }
        return false;
    }

    //searching the song in album arraylist
    private Song findSong(String songName){
        for (int i = 0; i < this.songs.size(); i++) {
            Song checkedSong = this.songs.get(i);
            if(checkedSong.getName().equals(songName)){
                return checkedSong;
            }
        }
        return null;
    }

    //TODO
    //1. Album class containing a song list(class)
}
