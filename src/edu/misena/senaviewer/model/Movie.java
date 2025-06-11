package edu.misena.senaviewer.model;
import java.util.ArrayList;

public class Movie extends Film {
    private String director;
    static ArrayList<Movie> movieList = new ArrayList<>();
    static {
        movieList.add(new Movie("Inception", "Sci-Fi", "Christopher Nolan", 148, 2010, "Christopher Nolan"));
        movieList.add(new Movie("The Godfather", "Crime", "Francis Ford Coppola", 175, 1972, "Francis Ford Coppola"));
        movieList.add(new Movie("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 1994, "Frank Darabont"));
    }

    public Movie(String title, String genre, String creator, int duration, int year, String director) {
        super(title, genre, creator, duration, year);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {  
        this.director = director;
     }

    public static void mostrarNombres(){
        for (int count = 0; count < movieList.size(); count++){
            System.out.println((count + 1) + ") " + movieList.get(count));
        }
    }
}
