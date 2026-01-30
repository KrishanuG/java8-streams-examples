package streams;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Emp {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Emp(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + "(" + salary + ")";
    }
}

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        List<Emp> empList = List.of(
                new Emp(1, "Alice", "IT", 70000),
                new Emp(2, "Bob", "IT", 90000),
                new Emp(3, "Charlie", "HR", 60000),
                new Emp(4, "David", "HR", 80000),
                new Emp(5, "Eve", "Finance", 75000)
        );
        // Group by Employees per Department
        Map<String, List<Emp>> empByDept = empList.stream().collect(Collectors.groupingBy(Emp::getDepartment));
        System.out.println("Employees Group by Department ->" + empByDept);

        // Average salary per Department
        Map<String, Double> empAvgSalByDept = empList.stream().collect(Collectors.groupingBy(
                Emp::getDepartment, Collectors.averagingDouble(Emp::getSalary)
        ));
        System.out.println("Avg salary of emp by Dept ->" + empAvgSalByDept);

        //Max Salary per Department
        Map<String, Emp> maxSalaryByDept = empList.stream().collect(Collectors.groupingBy(
                Emp::getDepartment, Collectors.collectingAndThen(
                        Collectors.maxBy(
                                Comparator.comparingDouble(Emp::getSalary)
                        ),
                        Optional::get
                )));
        System.out.println("Max Salary per Department -> " + maxSalaryByDept);
    }
}

