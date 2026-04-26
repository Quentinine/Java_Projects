package Projects.proje6.soru1;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String city;

    public Customer(int customerId, String firstName, String lastName, String city) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Müşteri ID: " + customerId + " | İsim: " + firstName + " " + lastName + " | Şehir: " + city;
    }
}