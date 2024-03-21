package in.assingment7;
import java.util.*;
//Write a program to print elements of Array ? 
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//       int[] arr= new int[] {54,4546,56565,56565};
		int[] arr= new int[5];
       
       for(int i=0;i<arr.length;i++) {
    	   System.out.println("Enter the element   : ");
    	   arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++) {
    	   System.out.println("The element arr["+i+"]     :   "+arr[i]);
       }
       
	}

}
