package strings;
import java.util.Scanner;

public class PalandromeCheck {
    public static void main(String args[]) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String output = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            output += name.charAt(i);
        }
        System.out.print(name.equals(output)?"Yes it is a palindrome":"no it is not a palindrome");
    }
}
