package numbers;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
private static int fibonaaci(int n) {
    if (n == 0 || n == 1) {
        return n;
    } else {
    return fibonaaci(n-1)+fibonaaci(n-2);
    }
}
    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print(fibonaaci(i)+" ");
        }
    }
}
