public class Employee implements Person {
    private String name;
    private String surname;
    private int age;
    private static final int RETIREMENT_AGE = 62;

    // Constructor
    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public void getInfo() {
        int yearsToRetirement = RETIREMENT_AGE - age;
        System.out.println("Employee Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Years to retirement: " + (yearsToRetirement > 0 ? yearsToRetirement : 0));
    }
}
