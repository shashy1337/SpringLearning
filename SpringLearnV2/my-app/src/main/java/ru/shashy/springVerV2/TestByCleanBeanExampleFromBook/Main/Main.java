package ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Helper.ProjectConfig;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Model.Comment;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Services.CommentService;

public class Main {
  public static void main(String[] args) {
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var comment = new Comment("Igor", "Hello!!!!");
      var serviceComment = context.getBean(CommentService.class);
      serviceComment.sendComment(comment);
  }
}