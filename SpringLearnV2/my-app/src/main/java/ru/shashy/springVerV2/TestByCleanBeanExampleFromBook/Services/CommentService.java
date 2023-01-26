package ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Helper.CommentNotificationProxy;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Helper.CommentRepository;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Model.Comment;

public class CommentService {

    @Autowired
    CommentNotificationProxy proxy;
    @Autowired
    CommentRepository repository;

    public CommentService(CommentNotificationProxy proxy, CommentRepository repository){
        this.proxy = proxy;
        this.repository = repository;

        System.out.println("Service created!");
    }

    public void sendComment(Comment comment){
        proxy.share(comment);
        repository.store(comment);
    }
}