import java.util.*;

public class Make_avg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the inputs");
        int a= sc.nextInt();
        int c= sc.nextInt();
        int b=(a+c)/2;
        System.out.println(b);
        if((a+c)/2==0){
            System.out.println("b is an integer ");
            
        }
        else{
            System.out.println("b is not an integer");
        }
        
        
        
    }
}
