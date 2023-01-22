package ru.shashy.springlearn.AutoWiredInjectionWithOtherBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.shashy.springlearn.AutoWiredInjectionWithOtherBeans")
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        var parrot1 = new Parrot();
        parrot1.setName("kiki");
        parrot1.setColor("orange");
        return parrot1;
    }

    @Bean
    public Parrot parrot2(){
        var parrot2 = new Parrot();
        parrot2.setName("koko");
        parrot2.setColor("green");
        return parrot2;
    }

}