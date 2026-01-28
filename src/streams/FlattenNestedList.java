package streams;

import java.util.Arrays;
import java.util.List;

/**
 * Given a List<List<Integer>>, flatten it into a single list using Java Streams.
 * Input:  [[1,2], [3,4], [5]]
 * Output: [1,2,3,4,5]
 **/

public class FlattenNestedList {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(List.of(1, 2), List.of(3, 4), List.of(5));
        List<Integer> flattenList = nestedList.stream().flatMap(List::stream).toList();
        System.out.println(flattenList);
    }
}
