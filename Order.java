public class Order {
    private String orderID;
    private String orderDate;
    private double totalAmount;
    private String status;

    public double calculateTotal() {
        return totalAmount;
    }

    public void confirmOrder() {
        this.status = "Confirmed";
    }

    // Constructors, getters, setters
}

