package JavaLearning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedString {

	public static void main(String[] args) {

		List<String>sorted=Arrays.asList("pavan","kumar","nagarajupalle").stream()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.print(sorted);
		
		
	}

}
