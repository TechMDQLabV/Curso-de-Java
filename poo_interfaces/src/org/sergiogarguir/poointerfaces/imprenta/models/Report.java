package org.sergiogarguir.poointerfaces.imprenta.models;

public class Report extends Sheet implements Imprimible{

    private Person author;
    private Person reviewer;


    public Report(Person author, Person reviewer, String content) {
        super(content);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String print() {
        return "Informe escrito por: " + this.author
                + "\nRevisado por: " + this.reviewer
                + "\n" + this.content;
    }
}
