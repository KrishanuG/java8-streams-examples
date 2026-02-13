package streams.intermediate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostFrequestCharacterInWord {
    public static void main(String[] args) {
        String word = "Banana";
       /* Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); */

        Map.Entry<Character, Long> collect = word.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(collect);

    }
}
