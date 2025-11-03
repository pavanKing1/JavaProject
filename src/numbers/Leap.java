package numbers;
import java.util.Scanner;
public class Leap{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0  && year%100!=0)|| year%400==0){
            System.out.println("leap year "+year);
        }
        else{
            System.out.println(" Not a leap year "+year);
        }
    }
}
