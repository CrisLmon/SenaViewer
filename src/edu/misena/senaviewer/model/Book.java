package edu.misena.senaviewer.model;

public class Book extends Publication { 
    private String authors;

    public Book(String title, String editionDate, String editorial, String authors) {
        super(title, editionDate, editorial);
        this.authors = authors;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

}
