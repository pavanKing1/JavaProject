package numbers;
import java.util.Scanner;

public class PalindromeCheck2 {
    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        String num=sc.next();
        StringBuffer str=new StringBuffer(num);
        String reverseString=str.reverse().toString();
        System.out.println(num.equals(reverseString)?"palindrome":"not a palindrome");
    }
}
