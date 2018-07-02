package com.sdgl.log;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class ControllerLogger {

     Logger logger = LoggerFactory.getLogger(ControllerLogger.class);

    /*环绕增强*/
   /// com.sdgl.controller
    @Around("execution(* com.*.*.*.*(..))")
    public Object arround(ProceedingJoinPoint jp)throws  Throwable{
        logger.info("调用" + jp.getTarget() + "的" + jp.getSignature().getName() + " 方法。 方法入参： "  + Arrays.toString(jp.getArgs()));

        try {
            Object result = jp.proceed();
            logger.info("调用" + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法返回值： " + result);
            return result;
        }catch (Throwable e){
            logger.info(jp.getSignature().getName() + " 方法发生异常： " + e);
            throw  e;
        }finally {
            logger.info(jp.getSignature().getName());
        }
    }

     /*前置增强*/
   /* @Before(value = "execution(* cn.service.*.*(..))")*/
    /*public void before(JoinPoint jp ){
        logger.info("调用" + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法入参： " + Arrays.toString(jp.getArgs()));
    }*/

    //后置增强

  /*@AfterReturning(pointcut = "execution(* com.*.*.*.*.*(..)))", returning = "returnValue")
   public void afterRunturing(Joinpoint  jp, Object returnValue){
        logger.info("调用" + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法返回值： " + returnValue );
    }*/

    /*最终增强*/
   /* @After("execution(* com.*.*.*.*(..))")
    public void after(JoinPoint jp){
        logger.info("调用" + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法结束执行");
    }*/


}
