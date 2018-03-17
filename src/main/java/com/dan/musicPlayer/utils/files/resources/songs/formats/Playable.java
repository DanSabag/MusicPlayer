package com.dan.musicPlayer.utils.files.resources.songs.formats;

public abstract class Playable {
    public static final String UNKNOWN = "Unknown";
    String fileRoute;

    abstract void play();
    abstract void pause();
    abstract void stop();
    abstract String getArtist();
    abstract String getAlbum();
    abstract String getTitle();
    abstract String getGenre();
    abstract String getYear();
}
