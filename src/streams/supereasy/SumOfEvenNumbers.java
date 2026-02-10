package streams.supereasy;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 1, 5, 3, 9, 6, 11, 20);
        Integer resultOfSumOfEvenNumbers = numbers.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println("Sum of result of even numbers is: " + resultOfSumOfEvenNumbers);
    }
}