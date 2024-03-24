package in.exam;
import java.util.*;
//. Write a Java program throws an array index out of bound exception.
public class Program {
	private static Scanner sc=new Scanner(System.in);
	public static void arr1(int[] arr) throws ArrayIndexOutOfBoundsException{
		for(int i=0;i<arr.length;i++)  {
			System.out.println("enter the arr : ");
			arr[i]=sc.nextInt();
		
				if(arr[i]<arr[i+1]) 
					System.out.println("if block");
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		int[] arr= new int[size];
		try {
			System.out.println("in try");
		Program.arr1(arr);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("in catch");
			ex.printStackTrace();
		}
	 System.out.println("array is "+ Arrays.toString(arr));
		


}
	}
