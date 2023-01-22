package ru.shashy.springlearn.AutoWiredInjectionWithOtherBeans;

public class Parrot {

    private String name;
    private String color;

    public Parrot(){
        System.out.println("Parrot created!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Parrot %s, color %s", name, color);
    }
}