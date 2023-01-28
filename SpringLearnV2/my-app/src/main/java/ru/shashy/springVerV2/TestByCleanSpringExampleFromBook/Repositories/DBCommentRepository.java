package ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Repositories;

import org.springframework.stereotype.Repository;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper.CommentRepository;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Model.Comment;


@Repository
public class DBCommentRepository implements CommentRepository {
    public DBCommentRepository(){
        System.out.println("Repository create");
    }
    @Override
    public void sendText(Comment comment) {
        System.out.println(String.format("Text stored: %s", comment.getText()));
    }
}