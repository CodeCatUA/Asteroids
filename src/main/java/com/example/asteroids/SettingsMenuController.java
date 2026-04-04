package com.example.asteroids;

import com.example.asteroids.GameSettings;

import javafx.event.ActionEvent;

import java.io.IOException;

public class SettingsMenuController {
    public void goBack(ActionEvent actionEvent) throws IOException {
        AsteroidApplication.setRoot("mainMenu-view");
    }

    public void easy(ActionEvent actionEvent) {
        GameSettings.setAsteroidSpeed(0.1);
    }

    public void medium(ActionEvent actionEvent) {
        GameSettings.setAsteroidSpeed(0.2);
    }

    public void hard(ActionEvent actionEvent) {
        GameSettings.setAsteroidSpeed(0.3);
    }
}
