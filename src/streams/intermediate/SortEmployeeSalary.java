package streams.intermediate;

import streams.intermediate.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Bob", "IT", 50000),
                new Employee(104, "Alice", "HR", 30000),
                new Employee(102, "James", "HR", 20000),
                new Employee(106, "Marco", "Finance", 80000),
                new Employee(108, "Silvia", "IT", 60000)

        );

        List<Employee> listAscending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println("Ascending order based on salary:" + listAscending);

        List<Employee> listDescending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println("Descending order based on salary:" + listDescending);
    }
}
