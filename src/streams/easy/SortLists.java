package streams.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q: sort a list in ascending or descending order using java streams
public class SortLists {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(99, 22, 12, 54, 78, 35, 61);

        List<Integer> ascendingList = numbers.stream().sorted().toList();
        System.out.println("Ascending order : " + ascendingList);

        List<Integer> descendinglist = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending order : " + descendinglist);

    }
}
