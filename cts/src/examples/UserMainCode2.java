package examples;

public class UserMainCode2 {
	public static int checkSum(int n)
	{
		int r,s=0;
		while(n>0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
		}
		if(s%2==0)
			return -1;
		else 
			return 1;
	}
}
