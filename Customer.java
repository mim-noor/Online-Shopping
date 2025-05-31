public class Customer {
    private String customerID;
    private int loyaltyPoints;

    public void addToCart(Product product) {
        System.out.println("Product added to cart.");
    }

    public double applyDiscount() {
        return loyaltyPoints * 0.01;
    }

    // Constructors, getters, setters
}

