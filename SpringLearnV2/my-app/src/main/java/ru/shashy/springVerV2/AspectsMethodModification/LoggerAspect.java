package ru.shashy.springVerV2.AspectsMethodModification;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import java.util.Arrays;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggerAspect {

    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* ru.shashy.springVerV2.AspectsMethodModification.*.*(..))")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable{
            String methodName = joinPoint.getSignature().getName();
            Object[] methodArgs = joinPoint.getArgs();
            logger.info(
                    String.format("Method execution name: %s, method args: %s", methodName, Arrays.asList(methodArgs).toString()));
            Comment comment = new Comment();
            comment.setAuthor("Liza");
            comment.setText("я терпила ебучая пиздец!");
            Object[] newArgs = {comment};
            Object method = joinPoint.proceed(newArgs);
            logger.info("Executed new args: " + method);
            return "FAILED!";
    }
}