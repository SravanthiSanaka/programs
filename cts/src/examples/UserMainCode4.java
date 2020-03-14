package examples;

public class UserMainCode4 {
	public static int findElement(int a[],int search)
	{
		int i;
		boolean found=false;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				found=true;
				break;
			}
		}
		if(found)
			return 1;
		else
			return -1;
	}
}
