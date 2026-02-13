package streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Q: Group a list of words by their length using streams
public class GroupListOfWordsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "banana", "cat", "grape", "bat", "lamp", "table");

        Map<Integer, List<String>> groupLengthResult = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouping Result: " + groupLengthResult);
    }
}
