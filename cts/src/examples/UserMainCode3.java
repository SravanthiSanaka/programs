package examples;

public class UserMainCode3 {
	public static int countVowels(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='0'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}
}
