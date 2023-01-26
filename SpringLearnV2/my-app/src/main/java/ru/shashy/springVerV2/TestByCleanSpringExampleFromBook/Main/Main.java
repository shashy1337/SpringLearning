package ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Model.Comment;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper.ProjectConfig;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Services.CommentServiceT;

public class Main {
  public static void main(String[] args) {
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var comment = new Comment("Igor", "Hello World!");
      var service = context.getBean(CommentServiceT.class);
      service.sendComment(comment);
  }
}