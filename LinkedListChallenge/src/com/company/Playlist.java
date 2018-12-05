package com.company;

import java.util.ArrayList;

public class Playlist {

    private ArrayList<Album> albums;

    public Playlist() {
        this.albums = new ArrayList<Album>();
    }


    public boolean addAlbum(String albumName){
        if(findAlbum(albumName) == null){
            this.albums.add(new Album(albumName));
            return true;
        }
        return false;
    }

    public boolean addSong(String albumName, String songName, double duration){
        Album album = findAlbum(albumName);
        if(album != null){
            return album.addSong(songName,duration);
        }
        return false;
    }

    private Album findAlbum(String albumName){
        for (int i = 0; i < this.albums.size(); i++) {
            Album checkedAlbum = this.albums.get(i);
            if(checkedAlbum.getAlbumName().equals(albumName)){
                return checkedAlbum;
            }
        }
        return null;
    }

    public boolean listSong(String albumName){
        Album album = findAlbum(albumName);
        if(album != null){
            System.out.println("List of song album:" + album.getAlbumName());

            ArrayList<Song> albumSongs = album.getSongs();//add arraylist t new arraylist
            for (int i = 0; i < albumSongs.size() ; i++) {
                Song albumSong = albumSongs.get(i);
                System.out.println("Song: " + albumSong.getName() + " duration: " + albumSong.getDuration());
            }
            return true;
        }else{
            return false;
        }

    }


}

