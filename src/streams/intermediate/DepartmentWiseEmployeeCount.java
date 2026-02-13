package streams.intermediate;

import streams.intermediate.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Q: Find all departments with more than 2 employees
public class DepartmentWiseEmployeeCount {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Bob", "IT", 50000),
                new Employee(2, "Alice", "HR", 30000),
                new Employee(3, "James", "HR", 20000),
                new Employee(4, "Marco", "Finance", 80000),
                new Employee(5, "Silvia", "IT", 60000),
                new Employee(6, "James", "Operation", 49000),
                new Employee(7, "Henry", "IT", 65000),
                new Employee(8, "Robert", "Finance", 54000)

        );

        List<String> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("All departments with more than 2 employees: " + result);
    }
}
