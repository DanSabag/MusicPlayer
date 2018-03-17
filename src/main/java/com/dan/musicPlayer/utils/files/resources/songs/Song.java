package com.dan.musicPlayer.utils.files.resources.songs;


import com.dan.musicPlayer.utils.files.resources.songs.formats.Playable;

public class Song {
    private String mArtistName;
    private String mAlbumName;
    private String mSongName;
    private String mArtRoute;
    private Playable mPlayable;

    public Song(String filePath) {

    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtRoute() {
        return mArtRoute;
    }

    public Playable getPlayable() {
        return mPlayable;
    }
}
