package examples;
import java.util.*;
public class ExceptionAssesment2 {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter size of the array");
	 int size=s.nextInt();
	 int a[]=new int[size];
	 System.out.println("enter the array elements");
	 for(int i=0;i<size;i++)
	 {
		 a[i]=s.nextInt();
	 }
	 System.out.println("enter the index of array element you want to access");
	 int i=s.nextInt();
	 try {
		 System.out.println("the element is:"+a[i]);
		 System.out.println("sucessful");
	 }
	 catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("unsucessful array index out of bound");
	 }
	}
	

}
