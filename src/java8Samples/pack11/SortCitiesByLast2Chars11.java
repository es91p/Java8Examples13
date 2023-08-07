package java8Samples.pack11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCitiesByLast2Chars11 {
    public static void main(String[] args) {
        System.out.println("Java8 starts here");
        List<String> cities = Arrays.asList("hyderabad", "chennai", "pune", "mumbai", "nasik", "delhi", "bangalore");
        cities.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********11******* " );
        Collections.sort(cities, (c1, c2) -> c1.compareTo(c2));
        cities.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********22******* " );
        Collections.sort(cities, (c1, c2) -> c1.substring(c1.length()-1).compareTo(c2.substring(c2.length()-1)));
        cities.forEach(city -> System.out.print(" " + city ));



    }
}
