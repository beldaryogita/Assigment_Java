import java.util.*;
class First{

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();       
        if(n>=80){
            System.out.println("grad A");
        }
        else if (n>=60){
            System.out.println("grad B");
        }
        else if(n>=35){
            System.out.println("passed");
        }
        else{
            System.out.println("fail");
        }




    }

}