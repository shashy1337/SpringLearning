package ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Services;

import org.springframework.stereotype.Component;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper.CommentNotificationProxy;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper.CommentRepository;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Model.Comment;


@Component
public class CommentServiceT {
    private final CommentNotificationProxy proxy;
    private final CommentRepository repository;

    public CommentServiceT(CommentNotificationProxy proxy, CommentRepository repository){
        this.proxy = proxy;
        this.repository = repository;
        System.out.println("Service Create!");
    }

    public void sendComment(Comment comment){
        proxy.shareText(comment);
        repository.sendText(comment);
    }
}