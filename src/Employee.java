import java.io.Serializable;

public class Employee implements Serializable {
    private final String name;
    private final String id;
    // transient
    private final Salary salary;

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = new Salary(salary);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary.getSalary();
    }
}
