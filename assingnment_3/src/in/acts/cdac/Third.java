package in.acts.cdac;
import java.util.*;
public class Third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the int two num");
		int n =sc.nextInt();
		int n1 = sc.nextInt();
		int add = n+n1;
	    System.out.println("the sum is "+ add);	
	    int sub = n-n1;
	    System.out.println("the subtract is "+sub);
	    int mul = n*n1;
	    System.out.println("the multiplication is "+mul);
	    float div = n/n1;
	    System.out.println("the division is "+div);
	    float mod =n%n1;
	    System.out.print("modules is "+mod);
	}

}
