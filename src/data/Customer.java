package data;

public class Customer extends Person {
    private double totalPayments;

    public Customer(String firstName, String lastName, Address address, double totalPayments) {
        super(firstName, lastName, address);
        this.totalPayments = totalPayments;
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    @Override
    public void printInfo() {
        System.out.println("data.Customer{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address=" + super.getAddress().getFullInfo() + '\'' +
                ", totalPayments=" + getTotalPayments() +
                '}');
    }
}
