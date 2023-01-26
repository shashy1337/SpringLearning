package ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Helper;


import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Model.Comment;

public interface CommentNotificationProxy {
    void share(Comment comment);
}