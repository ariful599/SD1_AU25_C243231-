
import java.util.*;
class main{
    public static void finding_avg_10.4(String[] args) {
        System.out.println("enter the array size");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
             sum+=arr[i];
        }
        
        int avg =sum/n;
        System.out.println(avg);
    }
}