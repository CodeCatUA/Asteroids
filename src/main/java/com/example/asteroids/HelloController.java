package com.example.asteroids;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private ImageView bg1, bg2;

    private double offset = 0;

    @FXML
    public void initialize() {
        Image background = new Image(getClass().getResourceAsStream("/images/background.jpg"));

        bg1.setImage(background);
        bg2.setImage(background);
        bg2.setLayoutX(900);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                offset -= 1; // offset = offset - 1;
                bg1.setLayoutX(offset);
                bg2.setLayoutX(offset + 900);

            }
        };
        timer.start();

    }
}