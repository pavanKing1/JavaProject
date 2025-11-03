package numbers;

import java.util.Scanner;

public class CreditScore {

    public  static void main( String args[]){
        System.out.println("Enter credit score: ");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if(score<400 || score>850){
            System.out.println("Invalid score "+score);
        }
        else{
            if(score >=400 && score <=600){
                System.out.println("silver card "+score);

            } else if (score>600 && score <=800) {
                System.out.println("Gold card");

            }
            else {
                System.out.println("Platinum card "+score);
            }
        }
    }
}
