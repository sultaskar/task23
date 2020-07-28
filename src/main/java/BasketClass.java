import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BasketClass implements Basket {

    List<Position> goods = new LinkedList<Position>();


    public void addProduct(String product, int quantity) {
        goods.add(new Position(product, quantity));

    }

    public void removeProduct(String product) {
        Iterator<Position> it = goods.iterator();
        while (it.hasNext()) {
            Position p = it.next();
            if (product.equals(p.product)){
                it.remove();
            }
        }
    }

    public void updateProductQuantity(String product, int quantity) {
        int index = 0;
        Iterator<Position> it = goods.iterator();
        while (it.hasNext()){
            Position p = it.next();
            if (product.equals(p.product)){
                index = goods.indexOf(p);
                it.remove();
            }
        }
        goods.add(index, new Position(product, quantity));
    }

    public void clear() {
        goods.removeAll(goods);
    }


    public List<String> getProducts() {
        List<String> list = new ArrayList<String>();
        for (Position g: goods)
            list.add(g.toString() + "\n");
        return list;
    }

    public int getProductQuantity(String product) {
        int quantity = 0;
        for (Position g : goods)
            if (product.equals(g.product)) {
                quantity = g.quantity;
            }
        return quantity;
    }
}
