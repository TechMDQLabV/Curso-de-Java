package org.sergiogarguir.anotaciones.ejemplo.models;

import org.sergiogarguir.anotaciones.ejemplo.Init;
import org.sergiogarguir.anotaciones.ejemplo.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Producto {
    @JsonAtributo()
    private String name;
    @JsonAtributo
    private Long price;
    private LocalDate date;

    @Init
    private void init(){
        this.name = Arrays.stream(name.split(" "))
                .map(palabra -> palabra.substring(0,1).toUpperCase(Locale.ROOT) + palabra.substring(1).toLowerCase(Locale.ROOT))
                .collect(Collectors.joining(" "));
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
