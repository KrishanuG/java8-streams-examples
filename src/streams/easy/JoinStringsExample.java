package streams.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsExample {
    public static void main(String[] args) {
        List<String> fruitList = Arrays.asList("Apple", "Mango", "Pineapple", "Strawberry", "Apricot");

        String jointStringResult = fruitList.stream().collect(Collectors.joining(","));
        System.out.println(jointStringResult);

        String jointStringWithSuffixAndPrefixResult = fruitList.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(jointStringWithSuffixAndPrefixResult);
    }
}
