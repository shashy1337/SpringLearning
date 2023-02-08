package ru.shashy.springVerV2.OtherAspectAdvice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggerAspect {

    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @AfterReturning(value = "@annotation(ToLog)", returning = "obj")
    public void logging(Object obj) throws Throwable {
            logger.info("Method executed! " + obj);
    }
}