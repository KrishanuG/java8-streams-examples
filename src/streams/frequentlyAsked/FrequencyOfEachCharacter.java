package streams.frequentlyAsked;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a Java Stream program to count the occurrence of each character in a string and return a Map<Character, Long>
 * Input:  "banana"
 * Output: {b=1, a=3, n=2}
 */
public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String input = "banana";

        Map<Character, Long> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}
