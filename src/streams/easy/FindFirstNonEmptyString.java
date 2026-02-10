package streams.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FindFirstNonEmptyString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("", null, "apple", "", "banana", "pineapple");
        Optional<String> result = list.stream().filter(Objects::nonNull).filter(s -> !s.isEmpty()).findFirst();
        System.out.println(result.get()); //apple
    }
}