package JavaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNamesByStartingLetter {

	public static void main(String[] args) {
		List<String>name=Arrays.asList("apple","banana","cat","dog","elephant");
		
		Map<Character,List<String>>grouped=name.stream().collect(Collectors.groupingBy(n->n.charAt(1)));
		System.out.print(grouped);
		
		
		
		
		
	}

}
