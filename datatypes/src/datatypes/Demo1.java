package datatypes;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(6,4,5,7,9,3,2,4,6,8);
		Stream<Integer> stream = nums.stream();
			
				
				
				
				
				
				
				
		stream.forEach(i -> System.out.println(i));		
	}

}
