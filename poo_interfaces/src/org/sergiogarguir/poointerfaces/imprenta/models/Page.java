package org.sergiogarguir.poointerfaces.imprenta.models;

public class Page extends Sheet implements Imprimible{


    public Page(String content) {
        super(content);
    }

    @Override
    public String print() {
        return this.content;
    }
}
