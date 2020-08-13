public class Good {
    String product;
    int quantity;

    public Good(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
