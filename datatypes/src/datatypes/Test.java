package datatypes;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		hm.put(10, "sachin");
		hm.put(7, "dhoni");
		hm.put(18, "kohli");
		hm.put(45, "rohith");
		
		System.out.println(hm);
		
		Set s= hm.keySet();
		System.out.println(s);
		System.out.println(s.getClass().getName());
		System.out.println();

		
		Collection c = hm.values();
		System.out.println(c);
		
		Set mapData = hm.entrySet();
		System.out.println(mapData);
		System.out.println();
		
		
		Iterator itr = mapData.iterator();
		while(itr.hasNext()) {
			Map.Entry data=(Map.Entry)itr.next();
			System.out.println(data.getKey()+ ": " + data.getValue());

			
		}




		

	}

}
