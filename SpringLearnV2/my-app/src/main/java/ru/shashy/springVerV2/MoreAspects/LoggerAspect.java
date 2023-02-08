package ru.shashy.springVerV2.MoreAspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggerAspect {

    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        logger.info(String.format("Method to execute name %s, his arguments %s", methodName, Arrays.asList(joinPoint.getArgs())));
        Object methodReturn = joinPoint.proceed();
        logger.info(String.format("Returned value by method %s", methodReturn));
        return methodReturn;
    }
}