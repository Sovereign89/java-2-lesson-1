package com.geekbrains.lesson_1.entities;

import com.geekbrains.lesson_1.Actions;
import com.geekbrains.lesson_1.objects.Racetrack;
import com.geekbrains.lesson_1.objects.Wall;

public class Cat implements Actions {

    private final double jumpHeight;
    private final double runDistance;

    public Cat(double jumpHeight, double runDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public boolean run(Racetrack racetrack) {
        if (this.runDistance > racetrack.getTrackLength()) {
            System.out.printf("Кошка пробежала беговую дорожку длинной в %,.2f%s \n", racetrack.getTrackLength(), racetrack.getValue());
            return true;
        }
        System.out.printf("Кошка не смогла пробежать беговую дорожку длинной в %,.2f%s \n", racetrack.getTrackLength(), racetrack.getValue());
        return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if (this.jumpHeight > wall.getWallHeight()) {
            System.out.printf("Кошка перепрыгнула стену высотой в %,.2f%s \n",wall.getWallHeight(),wall.getValue());
            return true;
        }
        System.out.printf("Кошка не смогла перепрыгнуть стену высотой в %,.2f%s \n",wall.getWallHeight(),wall.getValue());
        return false;
    }
}
