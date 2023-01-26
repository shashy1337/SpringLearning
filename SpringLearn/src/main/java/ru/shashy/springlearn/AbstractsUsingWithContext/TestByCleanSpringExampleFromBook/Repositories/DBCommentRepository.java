package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Repositories;

import org.springframework.stereotype.Component;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Helper.CommentRepository;
import ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {
    public DBCommentRepository(){
        System.out.println("Repository create");
    }
    @Override
    public void sendText(Comment comment) {
        System.out.println(String.format("Text stored: %s", comment.getText()));
    }
}