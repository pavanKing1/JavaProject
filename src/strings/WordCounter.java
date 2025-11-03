package strings;
import java.util.Scanner;

public class WordCounter {
    public static void main(String args[]) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.split(" ").length);
        int count=0;

        for(int i=0;i<input.length();i++){
            if(Character.isWhitespace(input.charAt(i))){
                count++;
            }
        }
        System.out.print(count+1);

    }
}
