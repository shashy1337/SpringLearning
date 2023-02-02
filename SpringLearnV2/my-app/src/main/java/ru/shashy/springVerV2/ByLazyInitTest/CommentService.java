package ru.shashy.springVerV2.ByLazyInitTest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {

    public CommentService(){
        System.out.println("CommentService init.");
    }
}