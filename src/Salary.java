import java.io.Serializable;

public class Salary implements Serializable {
    private final transient int salary;

    public Salary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
