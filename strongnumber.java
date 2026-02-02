import java.util.Scanner;
public class strongnumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;

        while (originalNum != 0) {
            int digit = originalNum % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            originalNum /= 10;
        }

        if (sum == num)
            System.out.println(num + " is a Strong number.");
        else
            System.out.println(num + " is not a Strong number.");

        scanner.close();
    }

}
    
    