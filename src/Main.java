
// Створити клас Employee, описати даний клас наступними полями: name, id, salary. Дані поля повинні бути private. Описати getters and setters. Створити клас Methods де описати всього два методи serialize() and deserealize().
//1).Створити метод Main створити екземпляр класу Employee і провести сереалізацію та десереалізацію. Результат Десереалізації вивести на консоль.
//2). Помітити поле salary модифікатором transient і провести сереалізацію і десереалізацію. Результат вивести на екран.
//3) Створити колекцію об’єктів Employee, провести сереалізацію та десереалізацю колекції
//4) Зробити Salary об’єктом, провести сереалізацію та десереалізацю.

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Base init
        Employee employee1 = new Employee("Mike","EMP0000001",2800);
        Employee employee2 = new Employee("Sveta","EMP0000002",3300);
        Employee employee3 = new Employee("Taras","EMP0000003",1900);
        Employee employee4 = new Employee("Liza","EMP0000004",5500);
        Employee employee5 = new Employee("Milana","EMP0000005",7300);

        // Save
        Methods<Employee> methods = new Methods<Employee>();
        methods.serialize(employee1);

        // Load saved object
        Employee employeeRestore = methods.deserealize();
        System.out.printf("Restored employee Name:%s, ID:%s, Salary:%s\n",employeeRestore.getName(),employeeRestore.getId(),employeeRestore.getSalary());


        // Base init second task
        List<Employee>  employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        // Save list of objects
        Methods<List<Employee>> methods2 = new Methods<List<Employee>>();
        methods2.serialize(employeeList);

        // Load list to new list
        List<Employee>  employeeList2 = methods2.deserealize();
        employeeList2.forEach(employee -> System.out.println(employee.getName()));
    }

}
