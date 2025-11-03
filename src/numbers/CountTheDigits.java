package numbers;

import java.util.Scanner;

public class CountTheDigits {
    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int digit, num = sc.nextInt();
        int result = 0;
        while (num != 0) {
            digit = num % 10;
          result++;
            num = num / 10;
        }
        System.out.print(" count of  numbers: " + result);
    }
}
