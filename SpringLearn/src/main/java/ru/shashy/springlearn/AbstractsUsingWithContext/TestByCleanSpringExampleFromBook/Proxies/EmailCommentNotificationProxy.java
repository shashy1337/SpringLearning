package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Proxies;

import org.springframework.stereotype.Component;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Helper.CommentNotificationProxy;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    public EmailCommentNotificationProxy(){
        System.out.println("proxy create!");
    }
    @Override
    public void shareText(Comment comment) {
        System.out.println(String.format("Author: %s, text: %s", comment.getAuthor(), comment.getText()));
    }
}