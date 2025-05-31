import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private String cartID;
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    // Constructors, getters, setters
}

