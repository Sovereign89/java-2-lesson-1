package com.geekbrains.lesson_1.entities;

import com.geekbrains.lesson_1.Actions;
import com.geekbrains.lesson_1.objects.Racetrack;
import com.geekbrains.lesson_1.objects.Wall;

public class Robot implements Actions {

    private final double jumpHeight;
    private final double runDistance;

    public Robot(double jumpHeight, double runDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public boolean run(Racetrack racetrack) {
        if (this.runDistance > racetrack.getTrackLength()) {
            System.out.printf("Робот пробежал беговую дорожку длинной в %,.2f%s \n", racetrack.getTrackLength(), racetrack.getValue());
            return true;
        }
        System.out.printf("Робот не смог пробежать беговую дорожку длинной в %,.2f%s \n", racetrack.getTrackLength(), racetrack.getValue());
        return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if (this.jumpHeight > wall.getWallHeight()) {
            System.out.printf("Робот перепрыгнул стену высотой в %,.2f%s \n",wall.getWallHeight(),wall.getValue());
            return true;
        }
        System.out.printf("Робот не смог перепрыгнуть стену высотой в %,.2f%s \n",wall.getWallHeight(),wall.getValue());
        return false;
    }

}
