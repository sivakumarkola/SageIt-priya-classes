package collection;

import java.util.ArrayList;

public class RemoveMethod {  
	   public static void main(String[] args) {  
		   
	      // creating an ArrayList having default size 5  
	      ArrayList<String> arr = new ArrayList<String>(5);  
	      // Adding elements to the ArrayList  
	      
	      arr.add("Helen");       
	      arr.add("Paul");  
	      arr.add("Elanie");  
	      arr.add("Marco");  
	      
	      System.out.println("The list of the size is: " + arr.size());  
	      System.out.println("Names is: " + arr);  
	    
	      arr.remove(0);
	      System.out.println("after removed list is:"+arr);  
	      
	      
	      // Showing all the elements in the ArrayList  
			/*
			 * for (String name : arr) { System.out.println("Name is: " + name); }
			 */
	  /*    
	      // Removing element available at position 1  
	      
	      arr.remove(1);  
	      
	      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
	      
	      // Showing all the elements in the ArrayList  
	      
	      for (String name : arr) {  
	         System.out.println("Name is: " + name); 
	         } */
	      }  
	   }  
	  