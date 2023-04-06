package org.sergiogarguir.poointerfaces.imprenta.models;

import java.util.ArrayList;
import java.util.List;

public class Resume extends Sheet implements Imprimible {

    private Person person;
    private String career;
    private List<String> experiences;

    public Resume(Person person, String career, String content) {
        super(content);
        this.person = person;
        this.career = career;
        this.experiences = new ArrayList<>();
    }

    public Resume addExperiences(String exp){
        this.experiences.add(exp);
        return this;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(this.person).append("\n")
                .append("Resumen: ").append(this.content).append("\n")
                .append("Profesión: ").append(this.career).append("\n")
                .append("Experiencias: \n");
        for(String exp: this.experiences){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
