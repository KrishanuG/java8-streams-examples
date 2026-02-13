package streams.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

// Q: Find the longest word in a sentence ignoring case and punctuation
public class FindLongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "A quick, brown fox jumps over the lazy dog!";

        String s = Arrays.stream(
                sentence.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" "))
                .max(Comparator.comparing(String::length))
                .orElse("");

        System.out.println(s);

    }
}
