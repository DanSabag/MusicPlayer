package com.dan.musicPlayer.ui.scenes.musicPlayer.components;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class SearchBar extends HBox {
    private Button mBtnSettings;
    private TextField mTxtSearch;

    public SearchBar() {
        // Initialize all of the members
        setComponents();
        addComponents();
    }

    private void setComponents() {
        // Set all components of this pane
        setSettingsButton();
        setSearchField();
    }

    private void addComponents() {
        // Add all of the components of this pane to the pane
        this.getChildren().add(mBtnSettings);
        this.getChildren().add(mTxtSearch);
    }

    private void setSettingsButton() {
        // TODO: 16/03/2018 Set on click to open the settings scene 
    }

    private void setSearchField() {
        // TODO: 16/03/2018 filter shown songs by the entered text
    }
}