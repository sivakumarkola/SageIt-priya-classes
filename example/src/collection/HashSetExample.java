package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
      public static void main(String[] args) {
    	  Set<Integer> hs = new HashSet<Integer>();
          hs.add(30);
          hs.add(67);
          hs.add(66);
          hs.add(79);
          System.out.println("Elements in set = "+hs);
          System.out.println("Does 89 in the set? "+hs.contains(89));
          System.out.println("Does 67 in the set? "+hs.contains(67));
	}
}
