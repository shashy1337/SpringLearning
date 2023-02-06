package ru.shashy.springVerV2.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggerAspect {

    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* ru.shashy.springVerV2.Aspects.*.*(..))")
    public void logging(ProceedingJoinPoint joinPoint) throws Throwable{
            logger.info("This method will be executed");
            joinPoint.proceed();
            logger.info("Method executed!");
    }
}