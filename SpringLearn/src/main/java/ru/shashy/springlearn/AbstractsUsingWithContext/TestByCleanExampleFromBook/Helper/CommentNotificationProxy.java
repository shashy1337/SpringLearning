package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Helper;

import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}