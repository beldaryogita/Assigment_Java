package in.cdac;
import java.util.*;

public class Obje {
static class Empolyee{
	private String name;
	private int empid;
	private float salarey;
  
	public void acceptRecord() {
	try( Scanner sc = new Scanner(System.in);){
		System.out.println("Enter the name empid salary");
		System.out.printf("%-20s","Enter the name : ");
		this.name= sc.nextLine() ;
		System.out.printf("%-10s","Enter the empid : ");
		this.empid = sc.nextInt();
		System.out.printf("%-20s","Enter the empid : ");
		this.salarey =sc.nextFloat();
		}
	}
	public void printRecord(){
		System.out.println("name is :"+this.name+"\n"+  "empid is : "+ this.empid +"\n"+"salary is :"+ this.salarey);
		
	}
		
	}

public static void main(String[] args) {
		Empolyee emp = new Empolyee();
		emp.acceptRecord();
		emp.printRecord();
				

	}

}
