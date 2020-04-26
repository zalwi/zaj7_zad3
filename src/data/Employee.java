package data;

public class Employee extends Person {
    protected double salary;

    public Employee(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void printInfo() {
        System.out.println("data.Employee{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address=" + super.getAddress().getFullInfo() + '\'' +
                ", salary=" + getSalary() +
                '}');
    }
}
