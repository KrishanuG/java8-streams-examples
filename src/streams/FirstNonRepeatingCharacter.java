package streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a string, find the first non-repeating character using Java Streams.
 * Input:  "java streams"
 * Output: 'j'
 **/
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "java streams";
        // Approach: 1
        Character resultUsingIndex = input.chars().mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))  //O(n^2) due to double index scanning
                .findFirst().orElse(null);

        System.out.println(resultUsingIndex);

        //Approach: 2
        Character resultUsingGroupingBy = input.chars(). // convert it to character int stream Ex. j  -> 106
                mapToObj(c -> (char) c)     // convert int stream to character
                .collect(Collectors.groupingBy(
                        Function.identity(),    //Use the character itself as the key
                        LinkedHashMap::new,     // Store results in insertion order
                        Collectors.counting()   //count how many times each character appears
                )).entrySet()     //Converts the map into: Set<Map.Entry<Character, Long>>
                .stream()
                .filter(e -> e.getValue() == 1) // Keep only characters that appear exactly once.
                .map(Map.Entry::getKey)  // Extract only the character, discard the count
                .findFirst()
                .orElse(null);

        System.out.println(resultUsingGroupingBy); // O(n)

    }
}
