package assessment;

public class DisplayMessage {
	  private String message;

	  public void setMessage(String message){
	     this.message=message;
	  }
	  public void getMessage(){
	     System.out.println("Your Message is : "+ message);
	  }
	  public void init(){
	     System.out.println("Bean Is Going Through Init");
	  }
	  public void destroy(){
	     System.out.println("Bean Will Destroy Now");
	  }
	}