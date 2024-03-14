import java.util.*;
class Fifth{

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        Character n=sc.next().charAt(0);       
        if( n=='a' || n=='e' || n=='i' || n=='o' || n=='u'){
            System.out.println("vovel");
        }
        else{
            System.out.println("constatnt");
        }




    }

}