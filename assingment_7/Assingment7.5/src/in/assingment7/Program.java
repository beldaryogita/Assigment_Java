package in.assingment7;
import java.util.*;
//Find out smallest and largest number in a given Array
 
public class Program {
    public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("The size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] is ");
            arr[i]=sc.nextInt();		
		}
		int min =arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]<min) {
					min=arr[i];
					
				}
				if(arr[i]>max) {
					max = arr[i];
				}
			
		}
		
		System.out.println("the largest is "+max);
		System.out.print("the smallest is "+min);
       
	}

}
