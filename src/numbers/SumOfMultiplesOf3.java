package numbers;
import java.util.Scanner;

public class SumOfMultiplesOf3 {
    public static void main(String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int digit, num = sc.nextInt();
        int sum=0;
        while(num!=0){
            digit=num%10;
            if(digit%3==0){
                sum=sum+digit;
            }
            num=num/10;

        }
        System.out.println("Sum of multiples of 3: "+sum);
    }
}
