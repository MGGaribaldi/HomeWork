/**
 *
 * Java 1.HomeWork5
 * @author Roman
 * @version 20.11.2021
 */

class Lession5 {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Antonio Banderas", "Actor", "banderas@mail.ru", 100000, 50);
            persArray[1] = new Employee("Chuck Norris", "Actor", "chuck@mail.ru", 200000, 82);
            persArray[2] = new Employee("Silvestr Stalone", "Actor", "silvestr@mail.ru", 250000, 72);
            persArray[3] = new Employee("Arnold Scnwarznegger", "Actor","arnold@mail.ru", 300000, 75);
            persArray[4] = new Employee("Ridli Scot", "Director", "scot@mail.ru", 1000000, 39);
    for (Employee employee : persArray)
            if (employee.getAge()>40)
            System.out.println(employee);
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private int salary;
    private int age;

    Employee(String name, String position, String email, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position + ", Email: " + email + ", Salary: " + salary + ", Age: " + age;
    }
}