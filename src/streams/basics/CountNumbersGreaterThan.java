package streams.basics;

import java.util.Arrays;
import java.util.List;

//Q: Count how many numbers are greater than 5 in the list
public class CountNumbersGreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 6, 3, 8, 10, 1);
        long count = numbers.stream().filter(number -> number > 5).count();
        System.out.println("Count the number greater than 5 is :" + count); // 6,8,10 -> total count 3
    }
}
