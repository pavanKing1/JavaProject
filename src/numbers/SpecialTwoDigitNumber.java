package numbers;
import java.util.Scanner;

public class SpecialTwoDigitNumber {
    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int digit1,digit2, num = sc.nextInt(),result;
        digit1=num%10;
        digit2=num/10;
        result=(digit1+digit2)+(digit1*digit2);
        System.out.print(result==num?"Special number":"Not a special number");

    }

}
