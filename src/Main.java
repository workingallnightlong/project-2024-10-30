import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //list of 5 students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", "Doe", 20));
        students.add(new Student(2, "Alice", "Johnson", 22));
        students.add(new Student(3, "Mike", "Smith", 21));
        students.add(new Student(4, "Emma", "Brown", 23));
        students.add(new Student(5, "Lucas", "Taylor", 24));

        System.out.println("Student Info:");
        for (Student student : students) {
            student.getInfo();
            System.out.println();
        }

        // list of 5 employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jane", "Doe", 45));
        employees.add(new Employee("Peter", "Johnson", 50));
        employees.add(new Employee("Linda", "Smith", 35));
        employees.add(new Employee("Paul", "Brown", 40));
        employees.add(new Employee("Anna", "Taylor", 55));

        System.out.println("Employee Info:");
        for (Employee employee : employees) {
            employee.getInfo();
            System.out.println();
        }
    }
}
