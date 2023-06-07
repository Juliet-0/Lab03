import java.util.ArrayList;

public class TestObserverPattern {
    public static void main(String[] args) {
        ArrayList<OrderObserver> observers = new ArrayList<>();
        Order order = new Order(1, 1, 10, observers);
        order.attach(new QuantityObserver());
        order.attach(new PriceObserver());
        order.toString();
        order.addItem(100);
        order.addItem(1);
        order.addItem(140);
        order.toString();
    }
}
