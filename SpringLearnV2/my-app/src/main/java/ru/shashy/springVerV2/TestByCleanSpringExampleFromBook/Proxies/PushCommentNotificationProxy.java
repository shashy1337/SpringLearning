package ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper.CommentNotificationProxy;
import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Model.Comment;

@Component
@Qualifier("PUSH")
public class PushCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void shareText(Comment comment) {
        System.out.println("pushed text: " + comment.getText());
    }
}