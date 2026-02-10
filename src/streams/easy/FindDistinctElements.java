package streams.easy;

import java.util.Arrays;
import java.util.List;

//Q: Find the distinct elements from the list or remove duplicates
public class FindDistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 8, 2, 5, 3, 2, 9, 1);

        List<Integer> list = numbers.stream().distinct().toList();
        System.out.println(list); // o/p - 5,8,2,3,9,1

    }
}
