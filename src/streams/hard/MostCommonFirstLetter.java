package streams.hard;

import streams.intermediate.dto.Employee;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Q: Find the most common first letter from all employee names
public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Bob", "IT", 50000),
                new Employee(2, "Alice", "HR", 30000),
                new Employee(3, "James", "HR", 20000),
                new Employee(4, "Dario", "Finance", 80000),
                new Employee(5, "Silvia", "IT", 60000),
                new Employee(6, "James", "Operation", 49000),
                new Employee(7, "Henry", "IT", 65000),
                new Employee(8, "Robert", "Finance", 54000)

        );

        Map.Entry<Character, Long> collect = employees.stream()
                .map(emp -> emp.getEmployeeName().charAt(0))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElseThrow();

        System.out.println(collect);
    }
}
