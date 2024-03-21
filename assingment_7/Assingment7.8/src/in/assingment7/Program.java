package in.assingment7;
import java.util.*;
/*8).Write a program which takes an array of integers and prints the running average of 3 consecutive integers. 
In case the array has fewer than 3 integers, there should be no output.
Input: [5,14,35,89,140]
Output: [18, 46, 88] 
(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)*/

public class Program {    
    private static Scanner sc = new Scanner(System.in);
      
    public static void acceptRecord(int[] arr) {
    	for(int i =0;i<arr.length;i++) {
    	  System.out.println("array");
    	  arr[i]=sc.nextInt();    	}
    }
    
    public static void printRecord(int[] arr) {

    	
    	for(int i=0;i<arr.length;i++) {
    		int result=(arr[i]+arr[i+1]+arr[i+2])/3;
    		System.out.println("the result is  "+result);
    	}
    	
    	
    }
    
     

    public static void main(String[] args) {
    	System.out.println("enter the sizee");
    	int size = sc.nextInt();
    	int[] arr= new int[size];  
    	
    	Program.acceptRecord(arr);
    	Program.printRecord(arr);
    	
  }
}
