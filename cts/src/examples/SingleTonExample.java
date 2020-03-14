package examples;

public class SingleTonExample {
	private static final SingleTonExample sngleton=new SingleTonExample();
	private SingleTonExample()
	{
		System.out.println("Inside the private constructer");
	}
	p SingleTonExample getInstance()
	{
		System.out.println("");
	}
	public void showData()
	{
		System.out.println("Inside the show data function");
	}
}
