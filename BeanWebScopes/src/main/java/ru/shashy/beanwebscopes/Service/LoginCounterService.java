package ru.shashy.beanwebscopes.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCounterService {
    private int count;

    public void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
