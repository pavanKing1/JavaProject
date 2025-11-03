package strings;
import java.util.Scanner;

public class VowelsAndConsonantsCount {
    public static void main(String args[]) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer vowels=new StringBuffer();
        StringBuffer consonants=new StringBuffer();
        int vowelsCount=0,consonantsCount=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'){
                vowels.append(input.charAt(i));
                vowelsCount++;
                continue;
            }
            else{
                consonants.append(input.charAt(i));
                consonantsCount++;
            }

        }
        System.out.println("vowels "+vowels +"count: "+vowelsCount );
        System.out.println("consonants "+consonants +"count: "+consonantsCount );
    }



}
