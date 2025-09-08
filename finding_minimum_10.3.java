
import java.util.*;
class main{
    public static void finding_minimum_10.3(String[] args) {
        System.out.println("enter the array element");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int min=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] <min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}