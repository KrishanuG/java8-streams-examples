package streams.intermediate;

import streams.intermediate.dto.Person;

import java.util.Arrays;
import java.util.List;

public class AverageAgePerson {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(30, "Alice"),
                new Person(50, "Danny"),
                new Person(20, "Donna"),
                new Person(60, "Vivek"),
                new Person(10, "Jeffrey")
        );

        Double average = personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
        System.out.println(average);

    }
}
