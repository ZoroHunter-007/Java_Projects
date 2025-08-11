package Data_Structure;

import java.util.HashMap;
import java.util.Map;


public class matrix_hashmap {
    public static void main(String[] args) {
    	int matrix[][]= {{1,2,3},{4,1,6},{3,8,2}};
    	HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
    	for(int []row:matrix) {
    		for(int value:row) {
    			map.put(value, map.getOrDefault(value, 0)+1);
    			
    		}
    	}
    	for(Map.Entry<Integer, Integer>mapel:map.entrySet()) {
    		System.out.println("The value "+ mapel.getKey() + " repeated "+ mapel.getValue()+ " times");
    	}
    	
    	
    }
}
