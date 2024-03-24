package in.exam;
import java.util.*;
//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

public class Program {
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	   System.out.println("enter the num");
		int n=sc.nextInt();
		try {
			if(n%2==1) {
				System.out.println("in try block");
				throw new Exception("number is odd");
			}
			
			System.out.println("the no is even   "+n);
			
		}catch(Throwable ex) {
			System.out.println("in catch block");
			ex.printStackTrace();
			
		}finally {
			sc.close();
			System.out.println("in finally block");
		}
		


}}
