package org.sergiogarguir.pooclasesabstractas.form.elementos;

import org.sergiogarguir.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;

    public SelectForm(String name) {
        super(name);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String name, List<Opcion> opciones) {
        super(name);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.name)
                .append("'>");
        for(Opcion opcion: this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValue())
                    .append("'");
            if(opcion.isSelected()){
                sb.append(" selected");
                this.value = opcion.getValue();
            }
                    sb.append(">")
                    .append(opcion.getName())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
