package ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Proxies;

import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Helper.CommentNotificationProxy;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Model.Comment;

public class EmailCiommentNotificationProxy implements CommentNotificationProxy {
    public EmailCiommentNotificationProxy(){
        System.out.println("proxy created!");
    }
    @Override
    public void share(Comment comment) {
        System.out.println(String.format("Author: %s, text: %s", comment.getAuthor(), comment.getText()));
    }
}