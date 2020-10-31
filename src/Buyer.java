import java.util.List;

public class Buyer extends User {

    private List<Product> cart;
    private double moneyAmount;

    public Buyer(String name, String email, String password, List<Product> cart, double moneyAmount) {
        super(name, email, password);
        this.cart = cart;
        this.moneyAmount = moneyAmount;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}
