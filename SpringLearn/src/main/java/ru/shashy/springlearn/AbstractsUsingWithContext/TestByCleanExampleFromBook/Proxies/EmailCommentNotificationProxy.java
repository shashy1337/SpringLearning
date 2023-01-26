package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Proxies;

import org.springframework.stereotype.Component;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Helper.CommentNotificationProxy;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}