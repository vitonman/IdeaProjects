package com.company;

public class Song {
    private String song_name;
    private double duration;

    public Song(String title, double duration) {
        this.song_name = title;
        this.duration = duration;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
