package day01;

import day01.Actor;


import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int yearOfRelease;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public void addActor(Actor actor) {
        actors.add(actor);

    }

    public int actorsInTheirTwenties() {
        int numberOfActors = 0;
        for (int i = 0; i < actors.size(); i++) {
            if ( Math.abs((actors.get(i).getYearOfBirth() - yearOfRelease)) > 20 &&
                Math.abs((actors.get(i).getYearOfBirth() - yearOfRelease)) < 30 ) {
                numberOfActors++;
            }
        }
        return numberOfActors;
    }


}
