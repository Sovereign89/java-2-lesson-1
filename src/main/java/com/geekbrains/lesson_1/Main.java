package com.geekbrains.lesson_1;

import com.geekbrains.lesson_1.entities.Cat;
import com.geekbrains.lesson_1.entities.Human;
import com.geekbrains.lesson_1.entities.Robot;
import com.geekbrains.lesson_1.objects.Obstacles;
import com.geekbrains.lesson_1.objects.Racetrack;
import com.geekbrains.lesson_1.objects.Wall;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Obstacles> createObstacles () {
        ArrayList<Obstacles> obstacles = new ArrayList<Obstacles>();
        Obstacles newRacetrack = new Racetrack("Беговая дорожка", 2);
        Obstacles newWall = new Wall("Стена", 1.5);

        obstacles.add(newRacetrack);
        obstacles.add(newWall);

        return obstacles;
    }

    public static ArrayList<Actions>  createEntities () {
        ArrayList<Actions> actions = new ArrayList<Actions>();

        Human human = new Human(1, 3); // Человек не прыгнет выше метра
        Cat cat = new Cat(0.5, 1); // Кошка у нас слабенькая
        Robot robot = new Robot(2,1.8); // Батарейки сядут бежать долго ))))

        actions.add(human);
        actions.add(cat);
        actions.add(robot);

        return actions;
    }

    public static void main(String[] args) {

        ArrayList<Obstacles> obstacles = createObstacles();
        ArrayList<Actions> actions = createEntities();

        for (Actions action: actions) {
            for (Obstacles obstacle : obstacles) {
                boolean result = false;
                if (obstacle instanceof Wall) {
                    Wall wall = (Wall) obstacle;
                    System.out.printf("Впереди %s высотой %,.2f%s \n",obstacle.getName(),wall.getWallHeight(),wall.getValue());
                    result = action.jump(wall);
                } else if (obstacle instanceof Racetrack) {
                    Racetrack racetrack = (Racetrack) obstacle;
                    System.out.printf("Впереди %s длиной в %,.2f%s \n",obstacle.getName(),racetrack.getTrackLength(),racetrack.getValue());
                    result = action.run(racetrack);
                }
                if (!result) { break; }
            }
        }
    }

}
