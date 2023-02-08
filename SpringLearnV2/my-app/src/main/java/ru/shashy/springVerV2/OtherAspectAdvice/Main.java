package ru.shashy.springVerV2.OtherAspectAdvice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var service = context.getBean(CommentService.class);
      var comment = new Comment();
      comment.setAuthor("Igor");
      comment.setText("Hi!");
      service.publishComment(comment);
      service.editComment(comment);
  }
}