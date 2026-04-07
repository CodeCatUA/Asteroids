package com.example.asteroids;

public class GameSettings {
    private double asteroidSpeed = 0.2;
    private static GameSettings instance;

    private GameSettings() {
    }

    public static GameSettings getInstance(){
        if (instance == null){
            instance = new GameSettings();
        }
        System.out.println(instance);
        return instance;
    }

    public double getAsteroidSpeed() {
        return asteroidSpeed;
    }

    public void setAsteroidSpeed(double asteroidSpeed) {
        this.asteroidSpeed = asteroidSpeed;
    }

}
