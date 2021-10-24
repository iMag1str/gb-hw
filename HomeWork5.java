/**
 * Java 1. HomeWork 5
 *
 * @author Mark
 * @version 24.10.2021
 */
class HomeWork5 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Ivanov Ivan", "Engineer", "iivan@mailbox.com", "892312312", 30000, 30),
            new Employee("Petrov Petya", "Builder", "petya12987@mailbox.com", "892365123", 40000, 44),
            new Employee("Olegov Oleg", "Manager", "ololeg@mailbox.com", "892365981", 29000, 29),
            new Employee("Goshev Gosha", "Doctor", "gosha123gosha@mailbox.com", "892312347", 30000, 41),
            new Employee("Vasiliev Vasiliy", "Consultant", "consulvasya321@mailbox.com", "892398771", 29000, 45),
        };

        for (Employee employee : employees)
            if (employee.giveAge() > 40)
                System.out.println(employee);
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int giveAge() {
        return age;
    }

    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}