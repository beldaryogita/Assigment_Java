package in.exam;
import java.util.*;
//1. Write a Java program that throws an arithmetic exception and catch it using a try-catch block.
public class Program {
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			
	   
		System.out.println("enter the two num");
		int n1=sc.nextInt();
		System.out.println("enter the second num");
		int n2=sc.nextInt();
		if(n2==0)  
			throw  new ArithmeticException("not be zero");
		
		int n3=n1/n2;
		System.out.println("result is "+n3);
		
		}	
		catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		catch(RuntimeException ex) {
			ex.printStackTrace();
			
		}catch(Exception ex){
			ex.printStackTrace();
			
		}catch(Throwable ex) {
			ex.printStackTrace();
		}
		finally {
			sc.close();
			System.out.println("close the scanner");
		}
	

}}
