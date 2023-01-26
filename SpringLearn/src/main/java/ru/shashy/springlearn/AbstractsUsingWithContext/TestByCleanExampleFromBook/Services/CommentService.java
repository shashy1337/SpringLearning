package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Services;

import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Helper.CommentNotificationProxy;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Helper.CommentRepository;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Model.Comment;
public class CommentService {
    private final CommentRepository repository;
    private final CommentNotificationProxy proxy;

    public CommentService(
            CommentRepository repository,
            CommentNotificationProxy proxy
            ){
        this.repository = repository;
        this.proxy = proxy;
    }
    public void publishComment(Comment comment){
        repository.storeComment(comment);
        proxy.sendComment(comment);
    }
}