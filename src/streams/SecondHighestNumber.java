package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

	public static void main(String[] args) {

		
	Optional<Integer>numbers=Arrays.asList(7,65,54,546,54654,6456,656,646,755,465,466,464,999)
			.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		System.out.println(numbers.orElse(null));
		
	}

}
