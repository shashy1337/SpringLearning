package ru.shashy.springVerV2.Aspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var service = context.getBean(CommentService.class);
      var comment = new Comment();
      comment.setAuthor("Igor");
      comment.setText("Hi!");
      service.publishComment(comment);
  }
}