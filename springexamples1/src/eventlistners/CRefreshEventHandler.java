package eventlistners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


public class CRefreshEventHandler implements ApplicationListener<ContextRefreshedEvent>{

	   public void onApplicationEvent(ContextRefreshedEvent event) {
	      System.out.println("ContextRefereshedEvent Received");
	   }
}
