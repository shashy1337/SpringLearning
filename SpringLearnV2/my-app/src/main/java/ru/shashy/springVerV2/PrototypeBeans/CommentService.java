package ru.shashy.springVerV2.PrototypeBeans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {
    
    public CommentService(){
        System.out.println("CommentService init.");
    }
}