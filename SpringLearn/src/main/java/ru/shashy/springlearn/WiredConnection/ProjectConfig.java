package ru.shashy.springlearn.WiredConnection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        var parrot = new Parrot();
        parrot.setName("Kiks");
        parrot.setColor("Green");
        return parrot;
    }

    @Bean
    public Human human(Parrot parrot){
        var human = new Human();
        human.setName("Kate");
        human.setParrot(parrot);
        return human;
    }
}