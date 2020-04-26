package data;

public class Address {
    private String city;
    private String street;
    private String homeNo;
    private String flatNo;

    public Address(String city, String street, String homeNo, String flatNo) {
        this.city = city;
        this.street = street;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }

    String getFullInfo() {
        return city + ", " + street + ", " + homeNo + "/" + flatNo;
    }
}
