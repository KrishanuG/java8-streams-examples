package streams.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
* Given a list of integers, partition the numbers into even and odd using Java Streams.
 * Output: {true=[even numbers], false=[odd numbers]}
*
**/

public class PartitionEvenOddNumbers {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 22, 99, 4, 3, 9, 6, 8, 7, 11, 63, 46);
        // Partition numbers into even and odd
        Map<Boolean, List<Integer>> partitionResult =
                integerList.stream()
                        .collect(Collectors.partitioningBy(
                                n -> n % 2 == 0
                        ));
        System.out.println("Partition Result: " + partitionResult);
        System.out.println("Only Even Number Result: " + partitionResult.get(true));
        System.out.println("Only Odd Number Result: " + partitionResult.get(false));

        // Partition numbers into even and odd & counting
        Map<Boolean, Long> partitionResultWithCount = integerList.stream().collect(Collectors.partitioningBy(
                n -> n % 2 == 0, Collectors.counting()
        ));
        System.out.println("Partition Result with odd & even count: " + partitionResultWithCount);

        // Partition numbers into even and odd with sorted order
        Map<Boolean, List<Integer>> partitionResultWithSortedOrder = integerList.stream().collect(Collectors.partitioningBy(
                n -> n % 2 == 0, Collectors.collectingAndThen(
                        Collectors.toList(), list -> {
                            list.sort(Comparator.naturalOrder());
                            return list;
                        }
                )
        ));
        System.out.println("Partition Result with sorted order: " + partitionResultWithSortedOrder);
    }
}
