package strings;
import java.util.Scanner;

public class StringChecksWithString {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter String s2: ");
        String s2 = sc.nextLine();
        int count=0;
        for(int i=s1.length()-1, j=s2.length()-1;j>=0;i--,j--) {
            if (s1.charAt(i) == s2.charAt(j)) {
                count++;
            }
        }
            if(s2.length()==count){
                System.out.println("yes");

            }
            else{
                System.out.println("no");
            }


    }

}
