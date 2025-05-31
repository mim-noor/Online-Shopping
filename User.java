public class User {
    private String userID;
    private String username;
    private String password;
    private String email;
    private String address;

    public void login() {
        System.out.println("User logged in.");
    }

    public void logout() {
        System.out.println("User logged out.");
    }

    public Order placeOrder() {
        return new Order(); // placeholder
    }

    // Constructors, getters, setters
}

