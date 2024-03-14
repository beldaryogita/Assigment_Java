package in.acts.cdac;

public class Program {
	public static void main(String[] args) {
		if( System.out.printf("Hello World!!") != null) {
			
		}
	}
	public static void main7(String[] args) {
		String name1 = "Sandeep Kulange";
		int empid1 = 10002779;
		float salary1 = 45000.50f;
		
		String name2 = "Amit Pol";
		int empid2 = 331;
		float salary2 = 125000.50f;
		
		System.out.println(name1+" "+empid1+" "+salary1);
		System.out.println(name2+" "+empid2+" "+salary2);
		
		System.out.println("---------------------------");
		
		System.out.printf("%-20s%-10d%-10f\n", name1, empid1, salary1);
		System.out.printf("%-20s%-10d%-10f\n", name2, empid2, salary2);
	}
	public static void main6(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int result = num1 + num2;
		
		System.out.print("Sum	:	"+ result +"\n");
		System.out.println("Sum	:	"+ result );
		System.out.printf("Sum	:	%d\n", result );
	}
	public static void main5(String[] args) {
		//System.out.println( 5 + 10 );
		//System.out.println("Sum	:	"+ 5 + 10 );	//Sum	:	510
		System.out.println("Sum	:	"+ ( 5 + 10 ) );	//Sum	:	510
	}
	public static void main4(String[] args) {
		System.out.printf("Hello World!!");
	}
	public static void main3(String[] args) {
		System.out.println("Hello ");
		System.out.println("World");
		System.out.println("!!");
	}
	public static void main2(String[] args) {
		System.out.print("Hello \n");
		System.out.print("World\n");
		System.out.print("!!\n");
	}
	public static void main1(String[] args) {
		System.out.print("Hello ");
		System.out.print("World");
		System.out.print("!!");
	}
}
