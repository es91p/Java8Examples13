package java8Samples.pack18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class intListToIntegerList11 {
	public static void main(String[] args) {
		
		int[] intArray11 = {40,39,27,46,27,50,10,20,30};
		
		List<Integer> intList11 = IntStream.of(intArray11).boxed().collect(Collectors.toList());
		
		intList11.stream().sorted().forEach(i -> System.out.print(i + " "));
		System.out.println("\n **********11******* " );
		
		//int array to Integer array
		
		
		List<Integer> intList12 = Arrays.asList(40,55,3339,27,46,22,11,27,50,10,20,30);
		intList12.stream().sorted().forEach(i -> System.out.print(i + " "));
		System.out.println("\n **********22******* " );
		int[] intArray12 = intList12.stream().mapToInt(Integer::intValue).toArray();
		System.out.println("\n intArray : " + Arrays.toString(intArray12) );
		
		
	}
	
}