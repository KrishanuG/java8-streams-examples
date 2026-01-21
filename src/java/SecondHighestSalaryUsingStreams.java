package java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Problem:
 * --------
 * Given:
 * 1) A list of salaries (integers)
 * 2) A list of employees with salary information
 * <p>
 * Find the SECOND-HIGHEST salary using Java 8 Streams.
 * <p>
 * Note:
 * - Duplicate salaries should be considered only once.
 * - If the second-highest salary does not exist, handle it safely.
 **/

public class SecondHighestSalaryUsingStreams {
    public static void main(String[] args) {

        List<Integer> salaryList = Arrays.asList(22000, 55000, 32000, 70000, 65000, 32000, 85000);

        Optional<Integer> secondHighestSalary = salaryList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighestSalary.ifPresent(System.out::println);

        List<Employee> employees = List.of(
                new Employee(1, "A", 85000),
                new Employee(2, "B", 70000),
                new Employee(3, "C", 75000),
                new Employee(4, "D", 65000),
                new Employee(5, "E", 55000)
        );

        Employee secondHighest =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .skip(1)
                        .findFirst()
                        .orElseThrow();

        System.out.println(secondHighest.getEmployeeName() + "->" + secondHighest.getSalary());

    }
}

class Employee {
    int id;
    String employeeName;
    int salary;

    public Employee(int id, String employeeName, int salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

}
