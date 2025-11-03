package numbers;
import java.util.Scanner;

public class PerfectNumberChecker {
private static Boolean Perfect(int num){
int sum=0;
for(int i=1;i<num;i++){
    if(num%i==0){
        sum=sum+i;
    }

}
    return sum==num;
}


    public  static void main( String args[]) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(Perfect(num));
    }
}
