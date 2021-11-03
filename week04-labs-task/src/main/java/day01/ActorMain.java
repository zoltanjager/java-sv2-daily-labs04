package day01;

public class ActorMain {
    public static void main(String[] args) {
        Actor actor = new Actor("Joe", 1981);
        Actor actor2 = new Actor("Jack", 1982);
        Actor actor3 = new Actor("Jane", 1963);

        Movie movie = new Movie("Titanic", 2005);
        movie.addActor(actor);
        movie.addActor(actor2);
        movie.addActor(actor3);
        System.out.println(movie.actorsInTheirTwenties());

    }
}
