import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scr.nextInt();

        int square = num * num;
        int originalNum = num;
        boolean isAutomorphic = false;

        while (originalNum > 0) {
            if (originalNum % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            isAutomorphic = true;
            originalNum /= 10;
            square /= 10;
        }

        if (isAutomorphic) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }
    }
}
