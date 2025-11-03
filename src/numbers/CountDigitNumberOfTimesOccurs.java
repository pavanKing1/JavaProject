package numbers;

import java.util.Scanner;

public class CountDigitNumberOfTimesOccurs {
    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);

        int digit, num = sc.nextInt();
        System.out.println("Enter number for search: ");
        int NumberToBeSearched=sc.nextInt();
        int result = 0;
        while (num != 0) {
            digit = num % 10;
            if(digit==NumberToBeSearched){
                result++;
            }

            num = num / 10;
        }
        System.out.print(" count of  numbers: " + result);
    }
}
