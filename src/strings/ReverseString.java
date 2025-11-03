package strings;
import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]){
        System.out.println("Enter String: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String output="";
        for(int i=name.length()-1;i>=0;i--){
            output+=name.charAt(i);
        }
        System.out.println(output);
        System.out.print("Reverse string by using String buffer method "+new StringBuffer(name).reverse());


    }


}
