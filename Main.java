import java.util.Scanner;
class Main{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        double  a= sc.nextDouble();
        System.out.println("enter the second number");
        double b= sc.nextDouble();
        System.out.println("enter the operetor (+,-,*,/)");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("the sum is: "+(a+b));
                break;      
            case '-':
                System.out.println("the difference is: "+(a-b));    
                break;
            case '*':                       
                System.out.println("the product is: "+(a*b));
                break;  
            case '/':
                if(b!=0){
                    System.out.println("the quotient is: "+(a/b));
                }else{
                    System.out.println("error: division by zero");
                }
                break;
            default:
                System.out.println("error: invalid operator");  
                return;


        }


    }
}