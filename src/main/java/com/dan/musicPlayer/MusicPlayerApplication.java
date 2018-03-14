package com.dan.musicPlayer;

import com.dan.musicPlayer.ui.scenes.SceneFactory;
import com.dan.musicPlayer.utils.constants.ApplicationConstants;
import javafx.application.Application;
import javafx.stage.Stage;

public class MusicPlayerApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        setStage(stage);
    }

    private void setStage(Stage stage) {
        //Setting title to the Stage
        stage.setTitle(ApplicationConstants.APPLICATION_NAME);
        stage.setMaximized(true);

        //Adding scene to the stage
        stage.setScene(SceneFactory.getScene("MusicPlayer"));

        //Displaying the contents of the stage
        stage.show();
    }
}
