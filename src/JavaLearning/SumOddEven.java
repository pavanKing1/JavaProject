package JavaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOddEven {

	public static void main(String[] args) {
		
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,0,11,22,34,23);
		
		Map<Boolean,Integer>sums=numbers.stream().collect(Collectors.partitioningBy(n->n%2==0,Collectors.summingInt(Integer::intValue)));

		int even=sums.get(true);
		int odd=sums.get(false);
		System.out.println(even);
		System.out.println(odd);
	}

}
