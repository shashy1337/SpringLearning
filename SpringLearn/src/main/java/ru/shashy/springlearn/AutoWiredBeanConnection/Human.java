package ru.shashy.springlearn.AutoWiredBeanConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {

    private String name;
    private Parrot parrot;

    //Привязка к полю класса
    /* @Autowired
    private Parrot parrot; */

    //Привязка через конструктор
    @Autowired
    public Human(Parrot parrot){
        this.parrot = parrot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Override
    public String toString() {
        return String.format("Human %s, his parrot %s", name, parrot);
    }
}