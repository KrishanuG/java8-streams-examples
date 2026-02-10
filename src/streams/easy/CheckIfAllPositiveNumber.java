package streams.easy;

import java.util.Arrays;
import java.util.List;

public class CheckIfAllPositiveNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(99, 12, -54, 78, 35, -1);
        boolean result1 = numbers.stream().allMatch(n -> n > 0);
        System.out.println(result1); // output - false as in the list -ve numbers present

        List<Integer> numbers1 = Arrays.asList(99, 12, 78, 35);
        boolean result2 = numbers1.stream().allMatch(n -> n > 0);
        System.out.println(result2); // output - true
    }
}
