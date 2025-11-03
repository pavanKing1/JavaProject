package arrays;

import java.util.Arrays;

public class ArraysIntro{
    /**
     * @param args
     */
    public static void main(String args[]){
        int[] arr={435,45,55,65,5645,546,535};
        System.out.println(arr);//[I@5a07e868
        
        //toString() method
        System.out.println(Arrays.toString(arr));//[435, 45, 55, 65, 5645, 546, 535]
        
        //Sorting
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[45, 55, 65, 435, 535, 546, 5645]
        
        //Copy of
        int[] arr1=Arrays.copyOf(arr, 9);
        System.out.println(Arrays.toString(arr1));//[45, 55, 65, 435, 535, 546, 5645, 0, 0]
        
        //object equals(checking the refernce of the object)
        int[] arr2={435,45,55,65,5645,546,535};
        System.out.println(arr.equals(arr2)); //false
        
        //value equals
        System.out.println(Arrays.equals(arr, arr2));//true
        
        //fill value
        int[] arr3=new int[10];
        Arrays.fill(arr3, 120);
        System.out.println(Arrays.toString(arr3));//[120, 120, 120, 120, 120, 120, 120, 120, 120, 120]
    }
}