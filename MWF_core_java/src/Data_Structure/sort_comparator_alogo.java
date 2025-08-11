package Data_Structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class AdminClass{
	int id;
	String name;
	public AdminClass(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class idchoice implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		AdminClass a1=(AdminClass)o1;
		AdminClass a2=(AdminClass)o2;
		/*if(a1.id==a2.id) {
			return 0;
		}
		else if(a1.id>a2.id) {
			return 1;
		}
		else {
		return -1;
		}*/
		return Integer.compare(a1.id,a2.id);
	}
	
}

class namechoice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		AdminClass a1=(AdminClass)o1;
		AdminClass a2=(AdminClass)o2;
		return a1.name.compareTo(a2.name);
	}
	
}
public class sort_comparator_alogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<AdminClass>al=new ArrayList<AdminClass>();
		al.add(new AdminClass(4,"test4"));
		al.add(new AdminClass(9,"aest4"));
		al.add(new AdminClass(2,"cest4"));
		al.add(new AdminClass(7,"vest4"));
		al.add(new AdminClass(21,"best4"));
		al.add(new AdminClass(1,"yest4"));
		
		Collections.sort(al, new idchoice());
		Iterator<AdminClass>it=al.iterator();
		while(it.hasNext()) {
			AdminClass a=it.next();
			System.out.println(a.id + " " + a.name);
		}
		
		System.out.println("\nSorting by name:");
		Collections.sort(al,new namechoice());
		Iterator<AdminClass>it1=al.iterator();
		while(it1.hasNext()) {
			AdminClass a=it1.next();
			System.out.println(a.id + " " + a.name);
		}

	}

}
