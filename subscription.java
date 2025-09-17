import java.util.*;

public class subscription {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter amount of money per subscription");
        int x= sc.nextInt();
        System.out.println("enter number of student");
        int n= sc.nextInt();
        int m;
        if((n/6.00)%2!=0){
            m=((n/6)*x)+x;
        }
        else{
            m=(n/6)*x;
        }
        System.out.println("minimum money to pay");
        System.out.println(m);
        
        
    }
}