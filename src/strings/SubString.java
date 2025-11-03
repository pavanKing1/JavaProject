package strings;
import java.util.*;

public class SubString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string s1: ");
        String str1 = s.next();
        System.out.println("Enter a string s2: ");
        String str2 = s.next();
        if (str1.endsWith(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
