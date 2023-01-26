package ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Repositories;

import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Helper.CommentRepository;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Model.Comment;

public class DBCommentRepository implements CommentRepository {

    public DBCommentRepository(){
        System.out.println("Repositori created!");
    }
    @Override
    public void store(Comment comment) {
        System.out.println("Stored comment: " + comment.getText());
    }
}