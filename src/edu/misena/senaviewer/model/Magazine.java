package edu.misena.senaviewer.model;

import java.util.ArrayList;

public class Magazine extends Publication {
    private String authors;
    static ArrayList<String> revista = new ArrayList<>();

    static{
        revista.add("Soho.");
        revista.add("Diners.");
        revista.add("Time.");
        revista.add("Vogue.");
    }

    public Magazine(String title, String editionDate, String editorial, String authors) {
        super(title, editionDate, editorial);
        this.authors = authors;
    }

    public static void mostrarNombres(){
        for (int count = 0; count < revista.size(); count++){
            System.out.println((count + 1) + ") " + revista.get(count));
        }
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

}
