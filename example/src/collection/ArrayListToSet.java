package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list =new ArrayList<String>();
		list.add("Ashu");
		list.add("Ashu");
		list.add("vishal");
		list.add("priya");
		list.add("saddam");
		System.out.println(list);
		Set<String> set=new HashSet<String>(list);
		System.out.println(set);

	}

}
