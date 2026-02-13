package streams.hard;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Q: Find top 3 most frequent words in a paragraph
public class FindTop3FreqWordInParagraph {
    public static void main(String[] args) {
        String paragraph = "Java is great. We are practicing Java streams. Java is powerful and coding in java is fun!";

        List<Map.Entry<String, Long>> top3Result = Arrays.stream(
                        paragraph.toLowerCase()
                                .replaceAll("[^a-z\\s]", "")
                                .split(" ")).collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        )).entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .toList();

        System.out.println(top3Result);

    }
}
