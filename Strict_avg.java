import java.util.*;

public class Strict_avg {
    public static void main(String[] args) {
         System.out.println("enter the numbers");
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double avg=a/b;
        double c=sc.nextDouble();
        if(avg>c){
            System.out.println("the avg is strictly greater than c");
        }
        else{
             System.out.println("the avg is not strictly greater than c");
        }
        
        }
    }
