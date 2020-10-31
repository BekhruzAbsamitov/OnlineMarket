import java.util.List;

public class Buyer extends User {

    private List<Product> cart;
    private double balance;

    public void buy() {

    }

    public Buyer(String name, String email, String password, List<Product> cart, double balance) {
        super(name, email, password);
        this.cart = cart;
        this.balance = balance;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
