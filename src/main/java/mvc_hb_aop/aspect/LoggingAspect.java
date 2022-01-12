package mvc_hb_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* mvc_hb_aop.dao.*.*(..))")
    public Object arounrAllRepoMethodAdvice(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature ms = (MethodSignature) pjp.getSignature();
        String mName = ms.getName();
        System.out.println("Begin of " + mName);
        Object targetMethodResult = pjp.proceed();
        System.out.println("End\n");
        return targetMethodResult;
    }
}
