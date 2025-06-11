package edu.misena.senaviewer.model;
import java.util.ArrayList;

public class Series extends Film {
    private String director;
    static ArrayList<Series> seriesList = new ArrayList<>();

    static {
        seriesList.add(new Series("Breaking Bad", "Drama", "Vince Gilligan", 50, 2008, "Vince Gilligan"));
        seriesList.add(new Series("Stranger Things", "Sci-Fi", "The Duffer Brothers", 55, 2016, "The Duffer Brothers"));
        seriesList.add(new Series("Game of Thrones", "Fantasy", "David Benioff & D.B. Weiss", 60, 2011, "David Benioff & D.B. Weiss"));
    }



    public Series(String title, String genre, String creator, int duration, int year, String director) {
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
        for (int count = 0; count < seriesList.size(); count++){
            System.out.println((count + 1) + ") " + seriesList.get(count));
        }
    }

}
