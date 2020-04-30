package appleInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class numberAtLast 
{

	
	 public static void main(String args[]) 
	 {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
		  Integer[] a = new Integer[size];
		  System.out.println("Enter the elements of the array ::");
		  for(int i=0; i<size; i++) 
		  {
			  Integer myVal = sc.nextInt();
			  a[i]=myVal;
		  }
		    List<Integer> l = Arrays.asList(a);
		    List<Integer> l1 = new ArrayList<>();
		    List<Integer> l2 = new ArrayList<>();
		    
		   // int[] cn = new int[100];
		    for(int i=0; i<l.size(); i++){
		        int c=Collections.frequency(l, l.get(i));
				if(c>1)
					l2.add(a[i]);
				else 
					l1.add(a[i]);
		    }
		    l1.addAll(l2);
		    System.out.println(l1);   
	 }
	
}
		 

