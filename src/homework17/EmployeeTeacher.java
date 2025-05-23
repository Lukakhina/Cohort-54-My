package homework17;

public class EmployeeTeacher {
    private String name;
    private int age;
    private double salary;

    public EmployeeTeacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void info(){
        System.out.printf("Employee %s, age: %d, salary: %.2f\n", name, age, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
