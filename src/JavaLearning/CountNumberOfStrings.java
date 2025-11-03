package JavaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountNumberOfStrings {

	public static void main(String[] args) {

		List<String>str=Arrays.asList("ggghgh","hgf","hh","hbgfg","ghhgff","gfhg","hhg","d","fdfd");
		
		List<String>count=str.stream().filter(s->s.length()>3).collect(Collectors.toList());
		System.out.println(count);
		
		
	}

}
