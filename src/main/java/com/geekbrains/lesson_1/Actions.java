package com.geekbrains.lesson_1;

import com.geekbrains.lesson_1.objects.Racetrack;
import com.geekbrains.lesson_1.objects.Wall;

public interface Actions {

    default boolean run(Racetrack racetrack) {
        System.out.println("Бег");
        return true;
    }

    default boolean jump(Wall wall) {
        System.out.println("Прыжок");
        return true;
    }

}
