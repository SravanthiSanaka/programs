package examples;
/*class MyThread implements Runnable{
	public void run() {
		System.out.println("Inside the thread");
	}
}*/

public class TestThread {
	public static void main(String[] args) {
		/*MyThread m1=new MyThread();
		Thread t=new Thread(m1);
		t.start();*/
		Runnable runnable=()->System.out.println("Inside the thread");
		Thread t=new Thread(runnable);
		t.start();
		
	}

}
