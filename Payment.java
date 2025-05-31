public class Payment {
    private String paymentID;
    private double amount;
    private String paymentMethod;

    public boolean paymentMethod() {
        return paymentMethod != null && !paymentMethod.isEmpty();
    }

    // Constructors, getters, setters
}

