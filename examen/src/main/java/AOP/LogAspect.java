package AOP;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Aspect
public class LogAspect {

  private Logger logger = Logger.getLogger(this.getClass().getName());

  public LogAspect() throws IOException {
    logger.addHandler(new FileHandler("log.xml"));
    logger.setUseParentHandlers(false);
  }

  @Pointcut("execution(* *.*(..))")
  public void pc1() {
  }

  @Around("pc1()")
  public Object onInit(ProceedingJoinPoint pjp) throws Throwable {
    logger.info("methode : " + pjp.getSignature());
    long time1 = System.currentTimeMillis();
    Object o = pjp.proceed();
    long time2 = System.currentTimeMillis();
    logger.info("duree (ms): " + (time2 - time1));
    logger.info("end");
    return o;
  }
}
