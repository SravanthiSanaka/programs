package collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;


public class SmallCapital {

	public static void main(String[] args) {
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		ArrayList1 ar12=new ArrayList1();
		hm1.put(001, "Sravs");
		hm1.put(002, "sravS");
		hm1.put(003, "sravs");
		hm1.put(004, "sRavs");
		hm1.put(005, "sravS");
		
		Set set=hm1.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			String str=(String) entry.getValue();
			if(str.charAt(0)>=97 
					&& str.charAt(0)<=122 
					&& str.charAt(str.length()-1)>=65 
					&& str.charAt(str.length()-1)<=90)
			{
				ar12.add(str);
			}
			
			
		}
		
		System.out.println("the names satisfying the condition are:");
		for(String c:ar12);
		System.out.println(c);
		
	}

}
