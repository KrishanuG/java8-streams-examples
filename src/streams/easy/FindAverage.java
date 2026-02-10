package streams.easy;

import java.util.Arrays;
import java.util.List;

public class FindAverage {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5,10,15,20,25);

        integerList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }
}
