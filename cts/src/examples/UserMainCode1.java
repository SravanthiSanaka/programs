package examples;

public class UserMainCode1 {
	public static boolean isPrime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c=c+1;
			}
		}
		if(c==2)
			return true;
		else
			return false;
	}
}
