package streams.intermediate.dto;

public class Employee {
    private int id;
    private String employeeName;
    private String department;
    private int salary;

    public Employee(int id, String employeeName, String department, int salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return id + " - " + employeeName + " - " + salary + " - " + department;
    }

}
