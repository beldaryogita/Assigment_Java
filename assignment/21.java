import java.util.*;
class Second{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =n%4;
        switch(m){
            case 0:System.out.println("leap"); break;
        default :System.out.println("not leap");break;
        }
    }
}