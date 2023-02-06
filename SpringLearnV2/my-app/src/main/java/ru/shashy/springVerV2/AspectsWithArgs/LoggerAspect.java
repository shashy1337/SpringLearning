package ru.shashy.springVerV2.AspectsWithArgs;

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

    @Around("execution(* ru.shashy.springVerV2.AspectsWithArgs.*.*(..))")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable{
            String methodName = joinPoint.getSignature().getName();
            Object[] methodArgs = joinPoint.getArgs();
            Object method = joinPoint.proceed();
            logger.info(
                    String.format("Method execution name: %s, method args: %s", methodName, Arrays.asList(methodArgs).toString()));
            logger.info("Executed and return: " + method);
            return method;
    }
}