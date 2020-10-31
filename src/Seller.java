public class Seller extends User {

    private double balance;


    private void setPrice() {

    }

    private void addProduct() {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Seller(String name, String email, String password) {
        super(name, email, password);
    }
}
