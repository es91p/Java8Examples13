package java8Samples.pack11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortCitiesByLast2Chars13 {

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
        System.out.println("\n **********33*****INITIAL ****** \n" );
        List<String> cities11 = Arrays.asList("hyderabad", "chennai", "pune", "punea", "pura", "punea", "panea","neebidda","neeabba", "neeamma", "piruneai","mumbai", "nasik", "delhi", "bangalore");
        cities11.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********44*****NORMAL SORTING** " );
        Collections.sort(cities11, (c1, c2) -> c1.compareTo(c2));
        cities11.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********55*****LAST 2 CHARACTERS** " );
        Collections.sort(cities11, (c1, c2) -> c1.substring(c1.length()-2).compareTo(c2.substring(c2.length()-2)));
        cities11.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********55*****LAST 2 CHARACTERS** " );
        Collections.sort(cities11, (c1, c2) -> c1.substring(c1.length()-2).compareTo(c2.substring(c2.length()-2)));
        cities11.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********551*****LAST 2 CHARACTERS***cities11.stream().sorted*** " );
        cities11.stream().sorted( (c1, c2) -> c1.substring(c1.length()-2).compareTo(c2.substring(c2.length()-2))) ;
        cities11.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********552*****LAST 2 CHARACTERS***cities11.sort()*** " );
        cities11.sort( (c1, c2) -> c1.substring(c1.length()-2).compareTo(c2.substring(c2.length()-2))) ;
        cities11.forEach(city -> System.out.print(" " + city ));

        System.out.println("\n **********66*******\n " );
        String[] strA11 = {"ABC25", "DEF10", "GHI88", "XYZ14"};
        List<String> strList11 = Arrays.stream(strA11).collect(Collectors.toList());
        System.out.println("\n **********77******* " );
        strList11.forEach(str -> System.out.print(" " + str ));
//        Collections.sort(strList11, (c1, c2) -> c1.compareTo(c2));
//        System.out.println("\n **********88******* " );
//        strList11.forEach(str -> System.out.print(" " + str ));
        System.out.println("\n **********771*****\n " );
        strList11.stream().sorted( (c1, c2) -> c1.substring(c1.length()-2).compareTo(c2.substring(c2.length()-2))) ;
        strList11.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********772*****LAST 2 CHARACTERS***cities11.stream().sorted***" );
        strList11.stream().sorted( (c1, c2) -> Integer.valueOf(c1.substring(c1.length()-2)) .compareTo( Integer.valueOf(c2.substring(c2.length()-2)))) ;
        strList11.forEach(city -> System.out.print(" " + city ));
        System.out.println("\n **********773*****LAST 2 CHARACTERS***cities11.sort()*** " );
        strList11.sort( (c1, c2) -> Integer.valueOf(c1.substring(c1.length()-2)) .compareTo( Integer.valueOf(c2.substring(c2.length()-2)))) ;
        strList11.forEach(city -> System.out.print(" " + city ));


    }

}
