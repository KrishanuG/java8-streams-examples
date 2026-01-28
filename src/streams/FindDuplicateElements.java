package streams;

import java.util.*;

/**
 * Given a list of integers, return a list of duplicate elements using Java Streams.
 * Input:  [2, 3, 2, 4, 3, 5]
 * Output: [2, 3]
 **/
public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(2, 3, 2, 4, 3, 5);
        Set<Integer> seen = new HashSet<>();
        // Approach1:
        List<Integer> duplicates = elements.stream().filter(
                n -> !seen.add(n)
        ).distinct().toList();
        System.out.println(duplicates);

        //Approach:2
        List<Integer> duplicatedList = elements.stream().filter(
                i -> Collections.frequency(elements, i) > 1).distinct().toList();
        System.out.println(duplicatedList);
    }
}
