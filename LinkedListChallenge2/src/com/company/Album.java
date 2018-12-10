package com.company;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;
    private String title;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<Song>();
    }

    public String getTitle() {
        return title;
    }

    
}
