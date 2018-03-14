package com.dan.musicPlayer.ui.scenes.musicPlayer.components;

import com.dan.musicPlayer.utils.files.resources.ResourceManager;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SideDrawer extends VBox {
    private Button mBtnSettings;
    private TextField mTxtSearch;
    private Separator mSeparator;
    private Button mBtnArtists;
    private Button mBtnAlbums;
    private Button mBtnSongs;
    private Button mBtnPlaylists;
    private Button mBtnCurrentlyPlaying;

    public SideDrawer() {
        // Initialize all of the members
        mBtnSettings = new Button(ResourceManager.get("imgHamburger"));
        mTxtSearch = new TextField();

        setComponents();
        addComponents();
    }

    private void setComponents() {
        // Set all components of this pane
        setSettingsButton();
    }


    private void addComponents() {
        // Add all of the components of this pane to the pane
        this.getChildren().add(mBtnSettings);
    }

    private void setSettingsButton() {
        // Set the button`s behavior
        // TODO: 13/03/18 Do this for all of the components
    }
}
