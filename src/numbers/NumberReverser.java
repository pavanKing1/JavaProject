package numbers;
import java.util.Scanner;

public class NumberReverser {
    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);

        int digit, num = sc.nextInt(),result=0;

        while (num != 0) {
            digit = num % 10;
           result=result*10+digit;
            num = num / 10;
        }
        System.out.print("String riverser: " + result);
    }
}
