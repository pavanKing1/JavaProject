package arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int[] num= {0,1,2,3,4,5,6,7,9};
		int n=9;//Highest number in an array
		int expectedSum=n*(n+1)/2;
		int actualSum=0;
		for(int nums:num) {
			actualSum=nums+actualSum;
		}
		System.out.println(actualSum);//37
		System.out.println(expectedSum);//45
		System.out.println(expectedSum-actualSum);//8
		
		
	}

}
