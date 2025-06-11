package edu.misena.senaviewer.model;

public class Publication {
    String title;
    String editionDate;
    String editorial;
    String authors;

    public Publication(String title, String editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }

    public String getTitle(){
        return title;
    }

    public String getEditionDate(){
        return editionDate;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setEditionDate(String editionDate){
        this.editionDate = editionDate;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
}
