package ru.shashy.springlearn.InjectionWithOtherBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot1(){
        var parrot = new Parrot();
        parrot.setName("Kaka");
        parrot.setColor("kakaland");
        return parrot;
    }


    @Bean
    public Parrot parrot2(){
        var parrot = new Parrot();
        parrot.setName("Kiki");
        parrot.setColor("Orange");
        return parrot;
    }


    @Bean
    public Parrot parrot3(){
        var parrot = new Parrot();
        parrot.setName("Bom");
        parrot.setColor(null);
        return parrot;
    }

    //   Явное внедрение в параметр экземпляр parrot2
    /*@Bean
public Human human(Parrot parrot2){
var human = new Human();
human.setName("Cum");
human.setParrot(parrot2);9
return human;
}*/

    //    @Qualifier
    @Bean
    public Human human(
            @Qualifier("parrot3") Parrot parrot){
        var human = new Human();
        human.setName("Cum");
        human.setParrot(parrot);
        return human;
    }
}