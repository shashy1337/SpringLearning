package ru.shashy.springVerV2.SingleToneSingleScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public CommentService commentService(){
        return new CommentService();
    }

    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Bean
    public CommentRepository commentRepository(){
        return new CommentRepository();
    }
}