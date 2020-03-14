package examples;

public class UserMainCode5 {
	public static int findElement(int a[],int search)
	{
		int mid;
		int low=0;
		int high=a.length-1;
		boolean found=false;
		mid=(low+high)/2;
		while(low<=high)
		{
			if(a[mid]==search)
			{
				found=true;
				break;
			}
			else if(a[mid]<search)
			{
				low=mid+1;
			}
			else if(a[mid]>search)
			{
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if(found)
			return 1;
		else
			return 0;
	}
}
