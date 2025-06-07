package edu.misena.senaviewer.model;

public class Magazine extends Publication {
    private String authors;

    public Magazine(String title, String editionDate, String editorial, String authors) {
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
