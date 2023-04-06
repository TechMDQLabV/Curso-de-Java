package org.sergiogarguir.java.jdbc.models;

import java.util.Date;

public class Product {
    private Long id;
    private String name;
    private Integer price;
    private Date register_date;
    private Category category;

    public Product() {
    }

    public Product(Long id, String name, Integer price, Date register_date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.register_date = register_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "| " + id +
                " | " + name +
                " | " + price +
                " | " + register_date +
                " | " + category.getName() +
                " |";
    }
}
