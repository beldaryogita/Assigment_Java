package in.assingment7;
import java.util.*;
//Write a program to reverse an Array in java 
 
public class Program {
    public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("The size of the array");
		int size=sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("array is ");
			arr[i]=sc.nextInt();
		}
		int start = 0;
		int end=size-1;
		while(start<end) {
			int temp =arr[start];
			arr[start]=arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
		
		
       
	}

}
