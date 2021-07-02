package kr.re.kitri.hello.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Aspect
@Component
public class LoggingAspect {

    public static Logger logger =
            LoggerFactory.getLogger(LoggingAspect.class);

    //@Before("execution(* kr.re.kitri.hello.controller.Post*.*(..))")
    public void logging(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getSignature().getDeclaringTypeName();
        logger.debug(className + "." + methodName + " 함수에서 로그를 남김니다.");
    }

    @Around("execution(* kr.re.kitri.hello.service..*(..))")
    public Object runtimeEstimator(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object obj = joinPoint.proceed();
        long timeEstimated = System.currentTimeMillis() - startTime;
        logger.debug(
                joinPoint.getSignature().getName()
                + " 메소드의 실행시간은 " + timeEstimated + "밀리초 입니다.");
        return obj;
    }
}
