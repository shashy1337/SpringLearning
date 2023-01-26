package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Helper;

import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}