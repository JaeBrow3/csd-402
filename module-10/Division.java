// Division.java
public abstract class Division {
    private String divisionName;
    private int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Getters
    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}
