package ru.shashy.springlearn.WiredConnection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WiredConnection {
    public static void main(String[] args){
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var parrot = context.getBean(Parrot.class);
      var human = context.getBean(Human.class);
      System.out.println(human.getName());
      System.out.println(human.getParrot());
    }
}