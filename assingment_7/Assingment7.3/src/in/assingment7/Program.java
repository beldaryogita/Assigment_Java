package in.assingment7;
import java.util.*;
//Write a Java program to check the equality of two arrays?
 
public class Program {
    public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int i=0;
//		int j=0;
//		int size1=0 ;
//		int size2=0;
		
		System.out.println("Enter the size of array1  :  ");
		int size1=sc.nextInt();
		System.out.println("Enter the size of arry2 : ");
		int size2=sc.nextInt();		
		
		 
		int[] arr = new int[size1];
		int[] arr1 = new int[size2];
		
		for(i=0;i<arr.length;i++){
			System.out.println("Enter the element arry1 :  ");
			arr[i]=sc.nextInt();
			
		}
		for(i=0;i<arr1.length;i++){
			System.out.println("Enter the element for second   :  ");
			arr1[i]=sc.nextInt();
			
		}
		
		
		for( i=0;i<arr.length;i++) {
			System.out.println("array is1 ["+(i+1)+"]   :  "+arr[i]);
			
		}
		for( i=0;i<arr1.length;i++) {
			System.out.println("array is2 ["+(i+1)+"]   :  "+arr1[i]);
			
		}
		if(Arrays.equals(arr,arr1)) {
			   System.out.println("the arry is same");
			}
			else {
				System.out.println("arry is not same");
			}
       
	}

}
