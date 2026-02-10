package streams.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20, 77, 34, 89, 55, 12);

        numbers.stream()
                .sorted(Comparator.reverseOrder()) //89,77,55,34,20,12
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }


}
