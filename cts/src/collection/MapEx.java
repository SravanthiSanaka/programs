package collection;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		Object rest=hm.put("k1","india" );
		hm.put("k2","china");
		hm.put("k3","america");
		Object obj=hm.putIfAbsent("k1", "canada");
		System.out.println(obj);
		System.out.println(rest);
		System.out.println(hm);
	}

}
