package streams.intermediate;

import streams.intermediate.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDeptAvgSalaryOfEmp {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Bob", "IT", 50000),
                new Employee(104, "Alice", "HR", 30000),
                new Employee(102, "James", "HR", 20000),
                new Employee(106, "Marco", "Finance", 80000),
                new Employee(108, "Silvia", "IT", 60000)

        );

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(result);
    }
}
