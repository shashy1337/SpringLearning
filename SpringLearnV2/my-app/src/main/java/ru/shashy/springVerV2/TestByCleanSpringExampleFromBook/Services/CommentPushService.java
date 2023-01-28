package ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper.CommentNotificationProxy;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper.CommentRepository;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Model.Comment;

@Service
public class CommentPushService {

    private final CommentNotificationProxy proxy;

    private final CommentRepository repository;

    public CommentPushService(@Qualifier("PUSH")CommentNotificationProxy proxy, CommentRepository repository){
        this.proxy = proxy;
        this.repository = repository;
    }

    public void sendComment(Comment comment){
        proxy.shareText(comment);
        repository.sendText(comment);
    }

}