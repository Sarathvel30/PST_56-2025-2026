import java.util.Scanner;
public class sumarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i]; // Add each element to sum
        }

        System.out.println("The sum of the array elements is: " + sum);
        scanner.close();
    }
} 