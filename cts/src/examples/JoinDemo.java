package examples;
class HelloThread extends Thread{
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println("Hello Thread");
			try {
				sleep(0);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class JoinDemo {
	public JoinDemo() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloThread h1=new HelloThread();
		h1.start();
		h1.yield();
		for(int i=101;i<=150;i++) {
			System.out.println("main thread");
		}
	}

}
