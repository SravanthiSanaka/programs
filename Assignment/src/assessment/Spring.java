package assessment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
  public static void main(String[] args) {
     AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
     HelloWorld h = (HelloWorld) context.getBean("SpringLifeCycle");
     h.getMessage();
     context.registerShutdownHook();
  }
}