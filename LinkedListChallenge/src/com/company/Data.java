package com.company;

import java.util.ArrayList;

public class Data {

    //Here is albums & songs data
    //Album Array

    private ArrayList<Album> albums;

    public Data() {
        this.albums = new ArrayList<Album>();
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public boolean addAlbum(String albumName){
        if(findAlbum(albumName) == null){
            this.albums.add(new Album(albumName));
            return true;
        }
        return false;
    }

    public void printAlbumData(){

        System.out.println("You have " + albums.size() + " items in your album list");
        for (int i = 0; i < albums.size() ; i++) {
            System.out.println((i+1) + ". ->" + albums.get(i).getAlbumName());
        }
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
            System.out.println("No that album in list.");
            return false;
        }

    }

}
