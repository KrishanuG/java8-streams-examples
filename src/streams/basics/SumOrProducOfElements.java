package streams.basics;

import java.util.Arrays;
import java.util.List;

//Q: Find the sum/product of element present in the list
public class SumOrProducOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sumResult = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of the element: " + sumResult);

        Integer product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product of the element: " + product);
    }
}