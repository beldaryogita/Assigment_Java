package in.assingment7;
import java.util.*;
//Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

 
public class Program {
    public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int um = 0;
		int sum=0;
		System.out.println("size of the array");
		int size= sc.nextInt();
		int[] arr = new int [size];
		
		System.out.println("Enter the target sum ");
		int ts=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter array element ");
			 arr[i] = sc.nextInt();
		
			
			}
		for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] + arr[j] == ts) {
	                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
	                }
	            }}
       
	}

}
