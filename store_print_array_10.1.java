
import java.util.*;
class {
    public static void store_print_array(String[] args) {
        System.out.println("enter the array element");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
