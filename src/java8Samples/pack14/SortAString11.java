package java8Samples.pack14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortAString11 {
    public static void main(String[] args)
    {
        String str = "GeeksforGeeks";

        String str1 = Stream.of(str.split(""))
                .sorted()
                .collect(Collectors.joining());

        System.out.println("Original string 11 : " + str);
        System.out.println("After sorting  string : " + str1);

        String str2 = Stream.of(str.split(""))
                .sorted()
                .collect(Collectors.joining());

        System.out.println("Original string 12  : " + str);
        System.out.println("After sorting  string : " + str2);
        
        List<Character> strList = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
        String Str14 = strList.stream().map(ch -> ch.toString()).collect(Collectors.joining());
       System.out.println("Original string 13  : " + str);
        System.out.println("After sorting  string : " + Str14);
        String str12 = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList()).stream().map(ch -> ch.toString()).sorted().collect(Collectors.joining());;
        System.out.println("Original string 131  : " + str);
        System.out.println("After sorting  string : " + str12);
        
       String str13 = "";
       
        System.out.println("Original string 14  "
        		+ ": " + str);
        System.out.println("After sorting  string : " + str13);
    }
}
