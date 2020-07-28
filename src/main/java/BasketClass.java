import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BasketClass implements Basket {

    List<Position> goods = new LinkedList<Position>();


    public void addProduct(String product, int quantity) {
        goods.add(new Position(product, quantity));

    }

    public void removeProduct(String product) {
        for (Position g: goods) {
            if (product.equals(g.product)){
                goods.remove(g);
            }
        }

    }

    public void updateProductQuantity(String product, int quantity) {
       int index = goods.indexOf(product);
       goods.remove(index);
       goods.add(index, new Position(product, quantity));

    }

    public void clear() {
        for (Position g: goods) {
            goods.remove(g);
        }

    }

    public List<String> getProducts() {
        List<String> list = new ArrayList<String>();
        for (Position g: goods)
            list.add(g.toString() + "\n");
        return list;
    }

    public int getProductQuantity(String product) {
        for (Position g : goods)
            if (product.equals(g.product)) {
                return g.quantity;
            }
        else return 0;
    }
}
