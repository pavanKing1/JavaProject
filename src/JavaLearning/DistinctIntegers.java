package JavaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctIntegers {

	public static void main(String[] args) {

	List<Integer>distincts=Arrays.asList(1,1,2,3,3,3,4,4,5,5,6,6,7,7,7,7,7).stream().distinct().collect(Collectors.toList());
		
		System.out.println(distincts);
	}

}
