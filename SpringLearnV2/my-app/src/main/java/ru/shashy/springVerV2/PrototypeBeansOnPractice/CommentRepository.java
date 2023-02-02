package ru.shashy.springVerV2.PrototypeBeansOnPractice;

import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {
    public void saveComment(Comment comment){
        System.out.println("Comment saved" + comment.getText());
    }
}