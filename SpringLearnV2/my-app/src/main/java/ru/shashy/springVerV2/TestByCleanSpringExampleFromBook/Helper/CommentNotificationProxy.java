package ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper;

import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Model.Comment;

public interface CommentNotificationProxy {
    void shareText(Comment comment);
}