package ru.shashy.springVerV2.PrototypeBeansOnPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    public CommentProcessor commentProcessor;

    public void sendComment(Comment comment){
        commentProcessor.processComment(comment, comment.getText() + "zaebis");
        commentProcessor.validateComment(comment);
        System.out.println(
                String.format("Formitted by %s, comment: %s", comment.getAuthor(), comment.getText()));
    }

}