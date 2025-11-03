package strings;
import java.util.Scanner;

public class MaxOccurances {

    public static void main(String args[]) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
int arr[]=new int[256];
for(int i=0;i<s.length();i++){
    arr[(int)s.charAt(i)]++;
}
  int m=0;
for(int j=0;j<arr.length;j++){
    if(arr[j]>arr[m]){
        m=j;
    }

}
        System.out.println("Maximum occurance: "+(char)m);
    }
}
