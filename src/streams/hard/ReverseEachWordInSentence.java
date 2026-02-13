package streams.hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String sentence = "Java streams examples";
        String reversedWordResult = Arrays.stream(sentence.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" ")); //avaJ smaerts selpmaxe

        System.out.println(reversedWordResult);

        // reverse the sentence using java stream
        String collect = Arrays.stream(sentence.split(" "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));

        System.out.println(collect);
    }
}
