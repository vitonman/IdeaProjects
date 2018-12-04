package com.company;



import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private LinkedList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new LinkedList<Song>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void setSongs(LinkedList<Song> songs) {
        this.songs = songs;
    }


    public static void printSongsFromAlbum(LinkedList<Song> songs){
        Iterator<Song> songlist = songs.iterator();
        while(songlist.hasNext()){
            System.out.println(songlist + ") " + "Song: " + songlist.next());
        }
        System.out.println("==============================");
    }


    //WORKING
    public boolean addSong(String songName, double songDuration){
        if(findSong(songName) == null){
            this.songs.add(new Song(songName, songDuration));
            return true;
        }
        return false;
    }


    //WORKING
    private Song findSong(String songName){
        for (int i = 0; i < this.songs.size(); i++) {
            Song checkedSong = this.songs.get(i);
            if(checkedSong.getTitle().equals(songName)){
                return checkedSong;
            }
        }
        return null;
    }




    //TODO
    //album class containing a list of songs
    //print a list of songs
    //
}
