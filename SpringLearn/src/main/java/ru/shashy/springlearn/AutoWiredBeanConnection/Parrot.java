package ru.shashy.springlearn.AutoWiredBeanConnection;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name;
    private String color;

    public Parrot() {
        System.out.println("Parrot created");
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Parrot %s, color %s", name, color);
    }
}