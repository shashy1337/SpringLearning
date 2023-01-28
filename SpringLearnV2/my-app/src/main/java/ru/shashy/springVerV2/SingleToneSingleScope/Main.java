package ru.shashy.springVerV2.SingleToneSingleScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var commentService = context.getBean(CommentService.class);
      var userService = context.getBean(CommentService.class);
      System.out.println(commentService.getCommentRepository() == userService.getCommentRepository());
  }
}