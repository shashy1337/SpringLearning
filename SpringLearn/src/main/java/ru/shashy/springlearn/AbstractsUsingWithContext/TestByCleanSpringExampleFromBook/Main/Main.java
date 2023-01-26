package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Model.Comment;

import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Services.CommentServiceT;
import ru.shashy.springlearn.WiredConnection.ProjectConfig;

public class Main {
  public static void main(String[] args) {
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var comment = new Comment("Igor", "Hello World!");
      var service = context.getBean(CommentServiceT.class);
      service.sendComment(comment);
  }
}