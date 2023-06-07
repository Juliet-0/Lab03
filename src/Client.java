import java.util.ArrayList;

public class Client {
    private ArrayList<Order> orders;

    public Client(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void create(Order order) {
        orders.add(order);
    }

    public void delete(Order order) {
        orders.remove(order);
    }

    public void update(Order order) {
        orders.set(orders.indexOf(order), order);
    }
}
