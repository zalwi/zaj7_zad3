package data;

public class Director extends Employee {
    private double bonus;

    public Director(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address, salary);
    }

    @Override
    public void printInfo() {
        System.out.println("data.Director{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address=" + super.getAddress().getFullInfo() + '\'' +
                ", salary=" + super.getSalary() + '\'' +
                ", bonus=" + getBonus() + '\'' +
                ", totalPayment=" + totalPayment() +
                '}');
    }

    private int totalPayment(){
        return (int)(super.getSalary()+(super.getSalary()*bonus));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
