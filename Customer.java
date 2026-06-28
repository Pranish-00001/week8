// Pranish Khanal
// Task 1-Customer Class

public class Customer {

    // Private instance variables
    private String firstName;
    private String lastName;
    private String email;
    private AccountStatus accountStatus;

    // Constructor with all instance variables
    public Customer(String firstName, String lastName, String email, AccountStatus accountStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.accountStatus = accountStatus;
    }

    // Overloading constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountStatus = AccountStatus.ACTIVE;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

}