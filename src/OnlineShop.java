import data.*;

class OnlineShop {
    public static void main(String[] args) {
        Address address = new Address("Wrocław", "Ćwiartki", "3", "4");
        Person person = new Person("Kamil", "Zalwert", address);
        Customer customer = new Customer("Jan", "Kowalski", address, 5000);
        Employee employee = new Employee("Karol", "Woźniak", address, 7000);
        Director director = new Director("Elon", "Musk", address, 10000000);

        person.printInfo();
        customer.printInfo();
        employee.printInfo();
        director.printInfo();
        director.setBonus(0.20);
        director.printInfo();
    }
}
