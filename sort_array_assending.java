
import java.util.*;
class sort_array_assending{
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int even=0;
        int odd=0;
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            
        }
        
           
           Arrays.sort(arr);
           for(int i=0; i<n; i++){
               System.out.print(arr[i]+" ");
           }
         
        
        
    
    
}
}