package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Given a list containing null values, write a Java Stream solution to filter nulls and return a clean list.
 * Input:  [1, null, 2, null, 3]
 * Output: [1, 2, 3]
 **/
public class RemoveNullValueSafely {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, null, 2, null, 3);

        List<Integer> nonNullList = integerList.stream().filter(
                Objects::nonNull
        ).toList();

        System.out.println(nonNullList);
    }
}
