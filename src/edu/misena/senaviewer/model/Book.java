package edu.misena.senaviewer.model;

import java.util.ArrayList;

public class Book extends Publication { 
    private String authors;
    static ArrayList<String> nombres = new ArrayList<>();
    
    static{
        nombres.add("Cin años de soledad.");
        nombres.add("Principito.");
        nombres.add("El amor en los tiempos del cólera.");
        nombres.add("Los juegos del hambre.");
    }

    public Book(String title, String editionDate, String editorial, String authors) {
        super(title, editionDate, editorial);
        this.authors = authors;
    }

    public static void mostrarNombres(){
        for (int count = 0; count < nombres.size(); count++){
            System.out.println((count + 1) + ") " + nombres.get(count));
        }
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

}
