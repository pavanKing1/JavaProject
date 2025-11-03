package numbers;
import java.util.Scanner;

public class PalindromeCheck {
    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);

        int digit, num = sc.nextInt(),result=0;
        int temp=num;
        while (num != 0) {
            digit = num % 10;
            result=result*10+digit;
            num = num / 10;
        }
        if(result==temp){
            System.out.print("It is a Palindrome");
        }
        else{
            System.out.print("It is not a Palindrome");
        }

    }
}
