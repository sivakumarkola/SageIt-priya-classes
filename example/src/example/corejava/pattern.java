package example.corejava;

import java.util.Iterator;

public class pattern {

	public static void main(String[] args) {
		int rows=6;
		for (int i=1; i<=rows;++i) {
			for(int j=1; j<=i;++j) {
				System.out.print(j+" ");	
				
			}
			System.out.println();
			
		}



	//int row=6;
	for (int i=1; i<=rows;++i) {
		for(int j=1; j<=i;++j) {
			System.out.print("* ");	
			
		}
		System.out.println();
		
	}
	
		
	}

	
}

