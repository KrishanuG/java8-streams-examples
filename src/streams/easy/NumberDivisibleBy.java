package streams.easy;

import java.util.Arrays;
import java.util.List;

public class NumberDivisibleBy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(99, 22, 66, 44, 33);
        boolean divisibleBy3 = numbers.stream().anyMatch(n -> n % 3 == 0);
        System.out.println(divisibleBy3);
    }
}
