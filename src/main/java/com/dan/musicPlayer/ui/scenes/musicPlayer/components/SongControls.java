package com.dan.musicPlayer.ui.scenes.musicPlayer.components;

import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class SongControls extends HBox {
    private Image mImgArt;
    private Text mTxtSongName;
    private Text mTxtArtistAlbum;
    private Text mTimePlayed;
    private Text mTimeLeft;
    private ProgressBar mProgressBar;
    private Button mBtnPrevious;
    private Button mBtnNext;
    private Button mBtnPlay;
    private Button mBtnPause;
    private Button mBtnStop;
    private Button mBtnShuffle;

    public SongControls(String songName, String artistAlbum) {
        // Initialize components
        setComponents();
        addComponents();
    }

    private void setComponents() {
        // Set each of the components (function for each)
    }

    private void addComponents() {
        // Add all of the components of this pane to the pane
    }
}
