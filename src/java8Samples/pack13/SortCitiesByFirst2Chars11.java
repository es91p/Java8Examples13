package java8Samples.pack13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortCitiesByFirst2Chars11 {
    public static void main(String[] args) {
        System.out.println("Java8 starts here");
        List<String> cities = Arrays.asList("hyderabad", "chennai", "pune", "punea", "pura", "punea", "panea","neebidda","neeabba", "neeamma", "piruneai","mumbai", "nasik", "delhi", "bangalore");
        cities.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********11******* " );
        Collections.sort(cities, (c1, c2) -> c1.compareTo(c2));
        cities.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********22***first one character of a string**** \n" );
        Collections.sort(cities, (c1, c2) -> c1.substring(0).compareTo(c2.substring(0)));
        cities.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********33***first three character of a string**** \n" );
        Collections.sort(cities, (c1, c2) -> c1.substring(0,2).compareTo(c2.substring(0,2)));
        cities.forEach(city -> System.out.print(" " + city ));

        System.out.println("\n **********44***cities starts with 'p' **** \n" );
        //Collections.sort(cities, (c1, c2) -> c1.substring(0,2).compareTo(c2.substring(0,2)));
        List<String> citiesStartsWithP =cities.stream().filter(city -> city.startsWith("p")).collect(Collectors.toList());
        citiesStartsWithP.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********55***cities starts with 'p' WITHOUT DUPLICATES **** \n" );
        //Collections.sort(cities, (c1, c2) -> c1.substring(0,2).compareTo(c2.substring(0,2)));
        List<String> citiesStartsWithPwithoutDuplicates =cities.stream().filter(city -> city.startsWith("p")).distinct().collect(Collectors.toList());
        citiesStartsWithPwithoutDuplicates.forEach(city -> System.out.print(" " + city ));



    }
}
