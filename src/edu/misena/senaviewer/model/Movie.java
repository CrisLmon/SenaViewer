package edu.misena.senaviewer.model;

public class Movie extends Film {
    private String director;

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

     public static void main(String[] args) {
        Movie movie = new Movie ("Inception", "Sci-Fi", "Christopher Nolan", 148, 2010, "Christopher Nolan");
        System.out.println(movie);
     }
}
