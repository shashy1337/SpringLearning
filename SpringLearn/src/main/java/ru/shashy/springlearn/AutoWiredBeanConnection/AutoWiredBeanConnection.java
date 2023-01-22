package ru.shashy.springlearn.AutoWiredBeanConnection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiredBeanConnection {
    public static void main(String[] args){
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var parrot = context.getBean(Parrot.class);
      var human = context.getBean(Human.class);
      human.setName("Kate");
      parrot.setName("Koko");
      parrot.setColor("Orange");
      System.out.println("Human name: " + human.getName());
      System.out.println("Human's parrot: " + human.getParrot());
    }
}