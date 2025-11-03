package strings;

import java.util.Scanner;

public class GoldFinder {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s1 : ");
        String s1 = sc.nextLine();
        System.out.println("Enter String s2 : ");
        String s2 = sc.nextLine();
Boolean found=false;
        for(int i=0;i<s1.length();i++){
            int k=i,j=0;
            for(j=0;j<s2.length();j++){
                if(s1.charAt(k)!=s2.charAt(j)){
                    break;
                }
                k++;
                if(j==s2.length()-1){
                    found=true;
                    break;
                }

            }
        }
if(found){
    System.out.println("contain gold");
}else{
    System.out.println("not contain gold");
}

    }
}
