package com.sangui.springboot.component;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-26
 * @Description: LoggingAspect
 * @Version: 1.0
 */
@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // 定义切入点，匹配所有以"service”结尾的包下的所有方法
    @Pointcut("execution(* com.sangui.springboot.service..*(..))")
    public void serviceMethods() {
    }

    //在切入点的方法执行前执行此方法
    @Before("serviceMethods()")
    public void logBefore (JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Method [{}] with arguments [{}] is called.", methodName, args);
    }


    @After("serviceMethods()")
    public void logAfter (JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Method [{}] with arguments [{}] is called.", methodName, args);
    }
}