
import java.util.*;
class main{
    public static void Odd_Even_10.5(String[] args) {
        System.out.println("enter the array size");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int even=0;
        int odd=0;
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            
        }
        for(int i=0; i<n; i++){
           if(arr[i]%2==0){
               even++;
           }
           else if(arr[i]%2!=0){
               odd++;
           }
            
        }
        System.out.println(even);
          System.out.println(odd);
        
        
    
    }
}