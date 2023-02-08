package ru.shashy.springVerV2.MoreAspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class SecurityAspect {

    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Security Aspect: Calling the intercepted method.");
        Object returnedValue = joinPoint.proceed();
        logger.info(String.format("Security Aspect: intercepted method returns %s", returnedValue));
        return returnedValue;
    }
}