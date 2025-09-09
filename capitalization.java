import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        if(s.length()>0){
            String capital= s.substring(0,1).toUpperCase()+ s.substring(1);
            System.out.println(capital);
        }
        else{
        System.out.println("no string enterd");
        }
    }
}