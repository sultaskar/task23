public class Main {

    public static void main(String[] args) {

        BasketClass basket = new BasketClass();
        basket.addProduct("Яйцо", 10);
        basket.addProduct("Хлеб", 2);
        basket.addProduct("Молоко", 2);
        basket.addProduct("Семечки", 1);

        System.out.println(basket.getProductQuantity("Хлеб"));

        System.out.println(basket.getProducts());
    }
}
