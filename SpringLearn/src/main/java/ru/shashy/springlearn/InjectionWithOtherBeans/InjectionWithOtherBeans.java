package ru.shashy.springlearn.InjectionWithOtherBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectionWithOtherBeans {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var human = context.getBean(Human.class);
        System.out.println(human.getName());
        System.out.println(human.getParrot());
    }
}