package CW2.ZAD5;

public class Address {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Address(String country, String city, String street, int house, int flat) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public Address(String country, String city, String street, int house) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public void printFullAddress() {
        System.out.println(this.country + " " + this.city + " " + this.street + " " + this.house + "/" + this.flat);
    }
}