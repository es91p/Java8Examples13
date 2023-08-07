package java8Samples.pack18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListToArray11 {
	public static void main(String[] args) {
		
		int[] intArray11 = {40,39,27,46,27,50,10,20,30};
		
		List<Integer> intList11 = IntStream.of(intArray11).boxed().collect(Collectors.toList());
		
		intList11.stream().sorted().forEach(i -> System.out.print(i + " "));
		System.out.println("\n **********11******* " );
		
		
		List<Integer> intList12 = Arrays.stream(intArray11).boxed().collect(Collectors.toList());
				
		intList12.stream().sorted().forEach(i -> System.out.print(i + " "));
		
		//Integer[] intArray13 = (Integer[]) intList12.toArray();
		
		Arrays.sort(intArray11);
		
		System.out.println("\n **********22******* " );
		
		System.out.println(" Integer Array : " + Arrays.toString(intArray11));
		
		
	}
	
}