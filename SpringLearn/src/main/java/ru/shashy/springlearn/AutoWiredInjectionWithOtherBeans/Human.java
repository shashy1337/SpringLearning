package ru.shashy.springlearn.AutoWiredInjectionWithOtherBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {
    private String name;
    private Parrot parrot;

    public Human(
            @Qualifier("parrot1") Parrot parrot){
        this.parrot = parrot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}