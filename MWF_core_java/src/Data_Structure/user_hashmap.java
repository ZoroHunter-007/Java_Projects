package Data_Structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class user_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		int ch=0;
		do {
			System.out.println("1. Add User");
			System.out.println("2. Display Key-Username");
			System.out.println("3. Enter Key you want to Remove");
			System.out.println("4. Enter Value and find its key");
			System.out.println("5. Exit");
			System.out.println("Enter your choice(1-5):");
			int choice=sc.nextInt();
		switch(choice) {
		case 1:
		
		System.out.println("Enter total number of user:");
		int size=sc.nextInt();
		int key=0;
		String val=null;
		for(int i=0;i<size;i++) {
			System.out.println("Enter Key:");
			key=sc.nextInt();
			System.out.println("Enter Value:");
			val=sc.next();
			map.put(key, val);
		}
		break;
		case 2:
		for(Map.Entry<Integer, String> mapel:map.entrySet()) {
			System.out.println("Key:" + mapel.getKey() + " Values:" + mapel.getValue());
		}
		break;
		
		case 3:
		System.out.println("Enter key you want to remove:");
		int s_key=sc.nextInt();
		
		
			if(map.containsKey(s_key))
			{
				map.remove(s_key);
				System.out.println(s_key+ " Key removed successfully...");
				
			}
			else {
				System.out.println(s_key+" Key is not exsist in map");
			}
			
			break;
			
			
		
		
		case 4:
		
		System.out.println("Enter value and find  its key:");
		String value=sc.next();
		boolean flag=false;
		for(Map.Entry<Integer, String>mapel:map.entrySet()) {
			if(mapel.getValue().equals(value)) {
				System.out.println(value+ " value for key: " +mapel.getKey());
				flag=true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println(value+ " value is not exsist in map");
			
			
			}
		break;
		
		case 5:
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid choice you enter please try again!");
		
		}
		System.out.println("Do you want to continue?:");
		ch=sc.nextInt();
		
		
	}while(ch==1);
		

	}
	

}
