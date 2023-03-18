package ru.shashy.ThymeLeafExample2.Model;

public class Product {
    private String name;
    private double price;


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}