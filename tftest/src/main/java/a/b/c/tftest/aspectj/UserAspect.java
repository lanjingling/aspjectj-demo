package a.b.c.tftest.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/** 
* 
* @author : knowliu
* @date ：Mar 19, 2022 6:07:07 PM 
*/
@Aspect
public class UserAspect {
    
    @Pointcut("execution(* cn.edu.nuc.test.*.*(..))")
    public void modelLayer() {
    }

    @Around("modelLayer()")
    public Object logProfile(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        System.out.println("[userAspect]方法: 【" + joinPoint.getSignature() + "】结束，用时: " + (System.currentTimeMillis() - start));

        return result;
    }

}
