package collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class MaxYear {

	public static void main(String[] args) {
		HashMap<Integer,Integer> stats=new HashMap<Integer,Integer>();
		System.out.println("enter number of entries");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the year");
			int year=sc.nextInt();
			System.out.println("enter number of admissions");
			int noa=sc.nextInt();
			
		}
		Set<Entry<Integer,Integer>> set=stats.entrySet();
		Iterator ir=set.iterator();
		int max=0;
		int tyear=0;
		int temp=0;
		while(ir.hasNext())
		{
			Map.Entry entry= (Map.Entry)ir.next();
			temp=(Integer) entry.getValue();
			if(temp>max) {
				max=temp;
				tyear=(Integer)entry.getKey();
			}
		}
		System.out.println("The details of maximum admission are:");
		System.out.println("Year:"+tyear+"Number of admissions"+max);
	}

}
