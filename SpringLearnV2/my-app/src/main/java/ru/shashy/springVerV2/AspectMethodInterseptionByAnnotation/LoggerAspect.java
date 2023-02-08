package ru.shashy.springVerV2.AspectMethodInterseptionByAnnotation;

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

    @Around("@annotation(ToLog)")
    public void logging(ProceedingJoinPoint joinPoint) throws Throwable {
            Object[] methodArgs = joinPoint.getArgs();
            String methodName = joinPoint.getSignature().getName();
            logger.info(String.format("Method name %s, method args %s", methodName, Arrays.asList(methodArgs)));
            joinPoint.proceed();
            logger.info("Method executed!");
    }
}