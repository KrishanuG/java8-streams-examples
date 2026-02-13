package streams.intermediate;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * You are given a list of strings representing words.
 * Your task is to count the frequency of each word and return the result as a map.
 * Each key in the map should be a word from the list, and the corresponding value should be the number of times that word appears.
 **/

public class CountFrequencyWordInList {
    public static void main(String[] args) {

        List<String> fruitList = List.of("apple", "orange", "pineapple", "orange", "apple", "orange", "banana");

        Map<String, Long> countResult = fruitList.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        TreeMap::new, // sort by key (alphabetical) , if no specifics , can be ignored
                        Collectors.counting()
                ));
        System.out.println(countResult); // as we are using map the order is not guaranteed

        // Without groupingBy()

        Map<String, Long> countResult1 = fruitList.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        v -> 1L,
                        Long::sum
                ));
        System.out.println(countResult1);
    }
}
