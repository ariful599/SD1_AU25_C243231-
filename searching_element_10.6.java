import java.util.*;

public class searching_element_10.6 {

    // Binary Search Function
    public static int binarySearch(int[] array, int x, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x == array[mid])
                return mid;

            if (x > array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9};
        int x = 4;
        int n = array.length;

        int result = binarySearch(array, x, 0, n - 1);

        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element is found at index " + result);
    }
}