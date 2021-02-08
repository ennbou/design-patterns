package AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Aspect
public class AuthAspect {

  private Scanner s = new Scanner(System.in);
  private Map<String,String> users = new HashMap<>();
  {
    users.put("user1", "1234");
    users.put("user2", "1234");
  }

  @Around("@annotation(Auth)")
  public Object onInit(ProceedingJoinPoint pjp) throws Throwable {

    Object o = null;

    String userName;
    String password;

    System.out.print("Username : ");
    userName = s.nextLine();
    System.out.print("Password : ");
    password = s.nextLine();
    String p = users.get(userName);
    if(p != null){
      if(p.equals(password)){
         o = pjp.proceed();
      }
    }

    return o;
  }

}
