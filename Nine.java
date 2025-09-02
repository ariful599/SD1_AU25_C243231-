import java.util.Scanner;

public class Nine{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N to find the sum from 1 to N: ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + N + " is: " + sum);

        scanner.close();
    }

}
