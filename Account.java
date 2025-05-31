public class Account {
    private String accountID;
    private String billingAddress;
    private boolean isActive;

    public void updateDetails(String newAddress) {
        this.billingAddress = newAddress;
    }

    public boolean checkStatus() {
        return isActive;
    }

    // Constructors, getters, setters
}
