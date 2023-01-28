package ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Helper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Proxies.EmailCiommentNotificationProxy;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Repositories.DBCommentRepository;
import ru.shashy.springVerV2.TestByCleanBeanExampleFromBook.Services.CommentService;

@Configuration
public class ProjectConfig {
    @Bean
    public CommentRepository dbCommentRepository(){
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy(){
        return new EmailCiommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(){
        return new CommentService();
    }
}