import java.util.*;
class Third{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the choice");
    System.out.println("1:addition");
    System.out.println("2:subtracrion");
    System.out.println("3:division");
    System.out.println("4:multiplication");
    System.out.println("5:modules");
    int c =sc.nextInt();
    System.out.println("enter the first number ");
    int m =sc.nextInt();
    System.out.println("enter the second number");
    int n =sc.nextInt();
    switch(c){
        case 1 : System.out.println("addition is "+ m+n);
        case 2 : System.out.println("addition is "+ (m-n));
        case 3 : System.out.println("addition is "+ m/n);
        case 4 : System.out.println("addition is "+ m*n);
        case 5 : System.out.println("addition is "+ m%n);
        default : System.out.println("wrong choice");
    }
    }
}