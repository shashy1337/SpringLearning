package ru.shashy.springVerV2.PrototypeBeansOnPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentProcessor {

    @Autowired
    private CommentRepository commentRepository;
    public void processComment(Comment comment, String string){
        comment.setText(string);
        System.out.println("Changed text: " + comment.getText());
        commentRepository.saveComment(comment);
    }

    public void validateComment(Comment comment){
        comment.setText("Validated comment " + comment.getText() + " " + "[Validated!]");
    }
}