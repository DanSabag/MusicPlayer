package com.dan.musicPlayer.ui.scenes.musicPlayer;

import com.dan.musicPlayer.ui.scenes.interfaces.ISceneDesign;
import com.dan.musicPlayer.ui.scenes.musicPlayer.components.SideDrawer;
import com.dan.musicPlayer.ui.scenes.musicPlayer.components.SongControls;
import com.dan.musicPlayer.utils.files.ConfigReader;
import javafx.scene.layout.GridPane;


public class MusicPlayer implements ISceneDesign<GridPane> {
    private static MusicPlayer instance;

    private SongControls mSongControls;
    private SideDrawer mSideDrawer;

    private MusicPlayer() {}

    public static MusicPlayer getInstance() {
        if (instance == null) {
            instance = new MusicPlayer();
        }

        return (instance);
    }

    private void setPaneStyle(GridPane pane) {
        String theme = ConfigReader.getParameter("theme").getAsString();
        pane.setStyle("-fx-background-color: " + (theme.equals("dark") ? "#272728" : "#e3e3e8"));
    }

    @Override
    public GridPane getPane() {
        GridPane pane = new GridPane();
        setPaneStyle(pane);

        return (pane);
    }
}
