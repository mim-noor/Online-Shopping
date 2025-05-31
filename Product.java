public class Product {
    private String productID;
    private String name;
    private double price;
    private int stockQuantity;

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void restock(int quantity) {
        this.stockQuantity += quantity;
    }

    public double getPrice() {
        return price;
    }

    // Constructors, getters, setters
}

