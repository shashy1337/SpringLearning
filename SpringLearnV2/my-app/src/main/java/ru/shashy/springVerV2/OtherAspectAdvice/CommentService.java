package ru.shashy.springVerV2.OtherAspectAdvice;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public void publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.getText());
    }


    public void deleteComment(Comment comment){
        logger.info("Delete comment: " + comment.getText());
    }

    public void editComment(Comment comment){
        logger.info("Editing comment: " + comment.getText());
    }
}