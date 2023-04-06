package org.sergiogarguir.poointerfaces.imprenta.models;

import java.util.ArrayList;
import java.util.List;

public class Book implements Imprimible{

    private List<Imprimible> pages;
    private Person author;
    private String title;
    private Genre genre;

    public Book(Person author, String title, Genre genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pages = new ArrayList<>();
    }

    public Book addPage(Imprimible page){
        pages.add(page);
        return this;
    }

    @Override
    public String print(){
        StringBuilder sb = new StringBuilder("Titulo: ")
                .append(this.title).append("\n")
                .append("Autor: ").append(this.author).append("\n")
                .append("Genero: ").append(this.genre).append("\n");
        for(Imprimible s: pages){
            sb.append(s.print()).append("\n");
        }
        return sb.toString();
    }
}
