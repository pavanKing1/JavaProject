package numbers;

import java.util.Scanner;

public class DuckNumber {
    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);

        int digit, num = sc.nextInt();
       Boolean isDuckNumber=false;
        int result = 0;
        while (num != 0) {
            digit = num % 10;
           if(digit==0){
               isDuckNumber=true;
           }
            num = num / 10;
        }
        if(isDuckNumber==true){
            System.out.println("Yes it is duck number");
        }
        else{
            System.out.println("no duck number");
        }
    }
}
