package numbers;

import java.util.Scanner;

public class ArmstrongNumberCheck {

    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),digit;
        int temp=num,sum=0;
        while(num!=0){
            digit=num%10;
            sum+=digit*digit*digit;
            // sum+=Math.pow(digit,3);
            num=num/10;
        }
System.out.println(temp==sum);

    }




}
