package in.acts.cdac;

public class Program {
	public static void main(String[] args) {
		char ch = 'A';
		int number = ch;
		System.out.println(number);
		
		
		String str = "A";
		System.out.println(str.codePointAt(0));
	}
	public static void main8(String[] args) {
		String str = "1A2b3@";
		int number= Integer.parseInt(str);	//UnBoxing	=>	NumberFormatException
		System.out.println("Number	:	"+number);
	}
	public static void main7(String[] args) {
		String str = "123";
		//int number = (int)str;	//Error: Cannot cast from String to int
		
		int number= Integer.parseInt(str);	//UnBoxing
		System.out.println("Number	:	"+number);
	}
	public static void main6(String[] args) {
		int number = 123;
		//String str = ( String)number;	//error: Cannot cast from int to String
		
		String str1 = Integer.toString(number);	//Boxing
		System.out.println("Number	:	"+str1);
		
		String str2 = String.valueOf(number);	//Boxing
		System.out.println("Number	:	"+str2);
	}
	public static void main5(String[] args) {
		double num1 = 10.5;		//Initialization
		int num2 = ( int )num1;	//Initialization	//Narrowing
		System.out.println("Num1	:	"+num1);
		System.out.println("Num2	:	"+num2);
	}
	public static void main4(String[] args) {
		int num1 = 10;		//Initialization
		//double num2 = ( double ) num1;	//Initialization	//Widening
		double num2 =  num1;	//Initialization	//Widening
		System.out.println("Num1	:	"+num1);
		System.out.println("Num2	:	"+num2);
	}
	public static void main3(String[] args) {
		double num1 = 10.5;		//Initialization
		double num2 = num1;	//Initialization
		System.out.println("Num1	:	"+num1);
		System.out.println("Num2	:	"+num2);
	}
	public static void main2(String[] args) {
		int num1 = 10;		//Initialization
		int num2 = num1;	//Initialization
		System.out.println("Num1	:	"+num1);
		System.out.println("Num2	:	"+num2);
	}
	public static void main1(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
	}
}
