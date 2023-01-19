package ru.shashy.springlearn.BeanAnnotExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    //parrot beans
    @Bean
    Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean
    Parrot parrot3(){
        Parrot p = new Parrot();
        p.setName("Kesha");
        return p;
    }

    @Bean
    int integer(){
        return 10;
    }

    @Bean
    String string(){
        return "ha ha ha!";
    }

    //Primary bean
    @Bean(name = "koks")
    @Primary
    Parrot parrot4(){
        Parrot p = new Parrot();
        p.setName("Koks");
        return p;
    }

}