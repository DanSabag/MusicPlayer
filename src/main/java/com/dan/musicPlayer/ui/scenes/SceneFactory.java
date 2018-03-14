package com.dan.musicPlayer.ui.scenes;

import com.dan.musicPlayer.ui.scenes.interfaces.ISceneDesign;
import com.dan.musicPlayer.ui.scenes.musicPlayer.MusicPlayer;
import javafx.scene.Scene;

import java.util.HashMap;

public class SceneFactory {
    private static HashMap<String, Scene> mScenes = new HashMap<>();

    static {
        mScenes.put("MusicPlayer", generateScene(MusicPlayer.getInstance()));
    }

    public static Scene getScene(String sceneName) {
        return (mScenes.get(sceneName));
    }

    private static Scene generateScene(ISceneDesign scenePrototype) {
        Scene scene = new Scene(scenePrototype.getPane());

        return (scene);
    }
}
