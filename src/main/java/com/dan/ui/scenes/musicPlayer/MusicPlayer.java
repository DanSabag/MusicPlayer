package com.dan.ui.scenes.musicPlayer;

import com.dan.ui.scenes.interfaces.IScene;
import com.dan.utils.files.ConfigReader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class MusicPlayer implements IScene {
    private GridPane getPane() {
        GridPane pane = new GridPane();
        setPaneStyle(pane);

        return pane;
    }

    private void setPaneStyle(GridPane pane) {
        String theme = ConfigReader.getParameter("theme").getAsString();
        pane.setStyle("-fx-background-color: " + (theme.equals("dark") ? "#272728" : "#e3e3e8"));
    }

    public Scene getScene() {
        Scene scene = new Scene(getPane());

        return scene;
    }
}
