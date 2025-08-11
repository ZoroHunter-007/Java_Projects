package Data_Structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class practice_hashmap {

	public void add(HashMap<Integer,HashSet<String>>map,HashSet<String>set1,String name,String address) {
		
		System.out.println(map + " "+ set1 + " "+ name+" "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice_hashmap ph=new practice_hashmap();
		HashSet<String>set1=new HashSet<String>();
	    set1.add("John");
	    set1.add("Doe");
	    set1.add("Jay");
	    set1.add("Dhruv");
		HashMap<Integer,HashSet<String>>map=new HashMap<Integer,HashSet<String>>();
		map.put(45, set1);
		ph.add(map, set1, "Abc", "Vadodara");
		
		
			
		
	}

}
