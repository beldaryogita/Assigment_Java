import java.util.*;
class Six{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weight and height in cm ");
        float w =sc.nextFloat();
        float h = sc.nextFloat();
        float t=w/(h/100);
        if(t>=18.5f){
            System.out.println("underweight");
        }
        else if(t>=18.5f && t<=24.9f){
            System.out.println("normal weight");
        }
        else if(t<=25 && t<=29.9f){
            System.out.println("overweight");
        }
        else{
            System.out.println("obese");
        }
    }
}
