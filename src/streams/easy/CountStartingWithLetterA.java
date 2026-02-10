package streams.easy;

import java.util.Arrays;
import java.util.List;

public class CountStartingWithLetterA {
    public static void main(String[] args) {
        List<String> fruitList = Arrays.asList("Apple", "Mango", "Pineapple", "Strawberry", "Apricot", "Avocado");

        long count = fruitList.stream().filter(fruit -> fruit.toLowerCase().startsWith("a")).count();
        List<String> filteredList = fruitList.stream().filter(fruit -> fruit.toLowerCase().startsWith("a")).toList();
        System.out.println("Fruits with 'A' " + filteredList + " and its count -> " + count);
    }
}
