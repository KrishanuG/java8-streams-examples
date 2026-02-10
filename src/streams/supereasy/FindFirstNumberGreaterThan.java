package streams.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Q: Find the first number greater than 10
public class FindFirstNumberGreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 12, 5, 11, 20);

        Optional<Integer> resultForGreaterThan10 = numbers.stream()
                .filter(n -> n > 10)
                .sorted()
                .findFirst();
        System.out.println("First number appeared which is greater than 10 from the list is : " + resultForGreaterThan10.get());

    }
}
