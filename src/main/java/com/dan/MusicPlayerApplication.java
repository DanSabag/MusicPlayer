package com.dan;

import com.dan.ui.scenes.musicPlayer.MusicPlayer;
import com.dan.utils.logging.MusicPlayerLogger;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MusicPlayerApplication extends Application {
    public static void main(String[] args) {
        MusicPlayerLogger.getInstance().error("Test!");
        initializeApplication();
        launch(args);
    }

    private static void initializeApplication() {

    }


    public void start(Stage stage) throws Exception {
        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting the padding
        //gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        //gridPane.setVgap(5);
        //gridPane.setHgap(5);

        //Setting the Grid alignment
        //gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid

        //Styling nodes
//        buttonRegister.setStyle(
//                "-fx-background-color: darkslateblue; -fx-textfill: white;");
//
//        nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
//        dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
//        genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
//        reservationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
//        technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
//        educationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
//        locationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

        //Setting title to the Stage
        stage.setTitle("MusicPlayer");
        stage.setMaximized(true);

        //Adding scene to the stage
        stage.setScene(new MusicPlayer().getScene());

        //Displaying the contents of the stage
        stage.show();
    }
}
