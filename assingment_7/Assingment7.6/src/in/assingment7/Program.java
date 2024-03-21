package in.assingment7;
import java.util.*;
//Print the third-largest number in an array without sorting it 
//Input: [ 24,54,31,16,82,45,67]

 
public class Program {
	 private static Scanner sc = new Scanner(System.in);
	public static void acceptRecord(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.println("array is ");
			arr[i]=sc.nextInt();
			
		}
	}
	/*public static void printRecord(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" ");
			
		}
	}*/
   
	public static int thirArray(int[] arr) {
		int firstMax=Integer.MIN_VALUE;
		int secondMax =Integer.MIN_VALUE;
		int thirdMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMax) {
			thirdMax = secondMax;
			secondMax=firstMax;
			firstMax=arr[i];
			}
			else if(arr[i]>secondMax && arr[i] !=firstMax) {
				thirdMax=secondMax;
				secondMax=arr[i];
			}
			else if(arr[i]>thirdMax && arr[i] != secondMax && arr[i] != firstMax) {
				thirdMax=arr[i];
			}
		}
		if(thirdMax==Integer.MIN_VALUE) {
			System.out.println("there are 3 distinct element in the array");
			return -1;
		}
		else {
			return thirdMax;
		}
	}
	public static void main(String[] args) {
		System.out.println("size of array is :");
		int size=sc.nextInt();
		int[] arr=new int[size];
	   Program.acceptRecord(arr);
//	   Program.printRecord(arr);
	  int thirdLargest = thirArray(arr);
	  if(thirdLargest != -1 ) {
		  System.out.println("third largest no: "+thirdLargest);
	  }
	
	}

}
