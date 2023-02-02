package ru.shashy.springVerV2.PrototypeBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var commentService = context.getBean("commentService", CommentService.class);
      var commentService2 = context.getBean("commentService", CommentService.class);
      boolean b = commentService == commentService2;
      System.out.println(b);
  }
}