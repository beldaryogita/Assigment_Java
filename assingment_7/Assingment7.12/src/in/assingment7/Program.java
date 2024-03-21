package in.assingment7;
import java.util.*;
/*10) Given an array of integers, print whether the numbers are in ascending order or in descending order or in random order without sorting
Input: [5,14,35,90,139] Output: Ascending 
Input: [88,67,35,14,-12] Output: Descending
Input: [65,14,129,34,7] Output: Random */


public class Program {    
    private static Scanner sc = new Scanner(System.in);
   
      public static void decendingorder(int arr[]) {
    	
    	for(int i = 0;i<arr.length;i++) {
    		Random rd = new Random();
		arr[i]=rd.nextInt();
		}
    	 
    	  System.out.println("random arr :"+Arrays.toString(arr));
    	 
    	  
    	  
      }

    public static void main(String[] args) {
    	        System.out.println("enter the size");
    	        int size=sc.nextInt();
    	        int[] arr = new int[size];

    	        System.out.println("Generated element:");
    	        Program.decendingorder(arr);
    	        
				
    	    }
    	

    	
  }
