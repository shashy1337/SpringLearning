package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Main;

import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Model.Comment;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Proxies.EmailCommentNotificationProxy;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Repositories.DBCommentRepository;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Services.CommentService;

public class TestByCleanExampleFromBook {

    public static void main(String[] args){
        var repository = new DBCommentRepository();
        var proxy = new EmailCommentNotificationProxy();
        var comment = new Comment();
        comment.setAuthor("Author1");
        comment.setText("CommentCheck");
        var service = new CommentService(repository, proxy);
        service.publishComment(comment);
    }
}