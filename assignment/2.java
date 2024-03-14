import java.util.*;
class Second {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the year");
        if(n%4==0){
            System.out.println("leap");
        }
        else{
            System.out.println("not leap");
        }


    }
}