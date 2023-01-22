package ru.shashy.springlearn.AutoWiredInjectionWithOtherBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiredInjectionWithOtherBeans {
    public static void main(String[] args){
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var human = context.getBean(Human.class);
      System.out.println(human.getParrot());
    }
}