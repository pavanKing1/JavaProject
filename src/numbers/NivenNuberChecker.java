package numbers;

import java.util.Scanner;

public class NivenNuberChecker {

    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num % sum(num) == 0 ? "Niven Number" : "Non Niven number");
    }
    private static int sum(int num) {
        int digit, sum = 0;
        while (num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
}
