package kr.re.kitri.hello.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    public static Logger logger =
            LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* kr.re.kitri.hello.service.*.*(..))")
    public void logging(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getSignature().getDeclaringTypeName();
        logger.debug(className + "." + methodName + " 함수에서 로그를 남김니다.");
    }
}
