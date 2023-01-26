package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Repositories;

import org.springframework.stereotype.Component;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Helper.CommentRepository;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanExampleFromBook.Model.Comment;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println(
                String
                    .format("Storing comment by %s, with arg %s", comment.getAuthor(), comment.getText()));
    }
}