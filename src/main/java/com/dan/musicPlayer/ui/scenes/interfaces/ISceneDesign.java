package com.dan.musicPlayer.ui.scenes.interfaces;

import javafx.scene.layout.Pane;

public interface ISceneDesign<T extends Pane> {
    T getPane();
}
