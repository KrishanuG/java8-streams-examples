package streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Q: Sum of square of even numbers in the list
public class SumSquareEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> sumOfSquareOfEvenNumber = numbers.stream()
                .filter(n -> n % 2 == 0) //2, 4, 6, 8
                .map(n -> n * n) // 4, 16,  36, 64
                .reduce(Integer::sum); //120
        System.out.println("Sum of square of Even Number is : " + sumOfSquareOfEvenNumber.get());
    }
}