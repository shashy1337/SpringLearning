package ru.shashy.springlearn.StereotypeAnnotationExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeAnnot {

  public static void main(String[] args){
      AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(ProjectConfig.class);
      Parrot p = context.getBean(Parrot.class);
      System.out.println(p);
      System.out.println(p.getName());
  }

}