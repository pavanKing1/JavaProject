package numbers;

import java.util.Scanner;

public class IntegerToBinary {

    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int[] binary=new int[10];

        int i=0;
        while(num!=0){
            binary[i]=num%2;
            num=num/2;
            i++;
        }
        for(int j=i-1; j>=0;j--){
            System.out.print(binary[j]);
        }
    }

    }
