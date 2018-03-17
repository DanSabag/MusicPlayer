package com.dan.musicPlayer.utils.files.resources.songs.formats;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MP3 extends Playable {
    private MediaPlayer mediaPlayer;

    public MP3(String filePath) {
        mediaPlayer = new MediaPlayer(new Media("file:///" + filePath));
    }

    @Override
    public void play() {
        mediaPlayer.play();
    }

    @Override
    public void pause() {
        mediaPlayer.pause();
    }

    @Override
    public void stop() {
        mediaPlayer.stop();
    }

    @Override
    String getArtist() {
        if (mediaPlayer.getMedia().getMetadata().containsKey("artist")) {
            return (String) mediaPlayer.getMedia().getMetadata().get("artist");
        }

        return UNKNOWN;
    }

    @Override
    String getAlbum() {
        if (mediaPlayer.getMedia().getMetadata().containsKey("album")) {
            return (String) mediaPlayer.getMedia().getMetadata().get("album");
        }

        return UNKNOWN;
    }

    @Override
    String getTitle() {
        if (mediaPlayer.getMedia().getMetadata().containsKey("title")) {
            return (String) mediaPlayer.getMedia().getMetadata().get("title");
        }

        return UNKNOWN;
    }

    @Override
    String getGenre() {
        if (mediaPlayer.getMedia().getMetadata().containsKey("genre")) {
            return (String) mediaPlayer.getMedia().getMetadata().get("genre");
        }

        return UNKNOWN;
    }

    @Override
    String getYear() {
        if (mediaPlayer.getMedia().getMetadata().containsKey("year")) {
            return (String) mediaPlayer.getMedia().getMetadata().get("year");
        }

        return UNKNOWN;
    }
}
