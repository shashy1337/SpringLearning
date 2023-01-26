package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Helper;

import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Model.Comment;

public interface CommentNotificationProxy {
    void shareText(Comment comment);
}