package streams.intermediate;

import streams.intermediate.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;
// Q: Find Highest paid employee in each department
public class HighestPaidEmployeeInEachDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Bob", "IT", 50000),
                new Employee(104, "Alice", "HR", 30000),
                new Employee(102, "James", "HR", 20000),
                new Employee(106, "Marco", "Finance", 50000),
                new Employee(108, "Silvia", "IT", 60000)

        );

        Map<String, Optional<Employee>> avgSalDeptWise = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(avgSalDeptWise);
    }
}
