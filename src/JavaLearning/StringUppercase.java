package JavaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUppercase {

	public static void main(String[] args) {

		List<String>strings=Arrays.asList("pavan","kumar","nagarajupalle");
		List<String>upperCase=strings.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCase);
		
	}

}
