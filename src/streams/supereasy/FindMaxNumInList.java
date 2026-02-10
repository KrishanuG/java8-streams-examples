package streams.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxNumInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 36, 22, 78, 23);
        Optional<Integer> optionalIntegerMax = numbers.stream().reduce(Integer::max);
        System.out.println("Max Num in list: " + optionalIntegerMax.get());
    }
}