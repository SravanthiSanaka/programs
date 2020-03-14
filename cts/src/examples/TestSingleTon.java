package examples;

public class TestSingleTon {
	public static void main(String args[])
	{
		SingleTonExample s=SingleTonExample.getInstance();
		s.showData();
	}
}
