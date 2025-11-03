package numbers;

import java.util.Scanner;

public class IntegerToBinary2 {
    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
    }
}
