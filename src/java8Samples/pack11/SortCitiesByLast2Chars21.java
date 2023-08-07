package java8Samples.pack11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortCitiesByLast2Chars21 {
    public static void main(String[] args) {
        System.out.println("Java8 starts here");
        //List<String> cities11 = Arrays.asList("hyderabad", "chennai", "pune", "punea", "pura", "punea", "panea","neebidda","neeabba", "neeamma", "piruneai","mumbai", "nasik", "delhi", "bangalore");
        
        List<String> cities = Stream.of("hyderabad", "chennai", "pune", "punea", "pura", "punea", "panea","neebidda","neeabba", "neeamma", "piruneai","mumbai", "nasik", "delhi", "bangalore").collect(Collectors.toList());
        cities.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********11******* " );
        Collections.sort(cities, (c1, c2) -> c1.compareTo(c2));
        cities.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********22******* " );
        Collections.sort(cities, (c1, c2) -> c1.substring(c1.length()-1).compareTo(c2.substring(c2.length()-1)));
        cities.forEach(city -> System.out.print(" " + city ));



    }
}
