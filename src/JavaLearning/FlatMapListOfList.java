package JavaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapListOfList {

	public static void main(String[] args) {
List<List<String>>nested=Arrays.asList(Arrays.asList("kumar","pavan"),Arrays.asList("pavan","kumar"));

List<String>flat=nested.stream().flatMap(List::stream).collect(Collectors.toList());
		
	System.out.println(flat);	
		
	}

}
