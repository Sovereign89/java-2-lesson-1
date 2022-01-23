package com.geekbrains.lesson_1.objects;

public class Racetrack extends Obstacles {

    private double trackLength = 0;
    private final String value = "км.";

    public Racetrack(String name, double trackLength) {
        this.setName(name);
        this.trackLength = trackLength;
    }

    public double getTrackLength() {
        return trackLength;
    }

    public String getValue() {
        return value;
    }
}
