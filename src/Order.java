import java.util.ArrayList;

public class Order {
    private int count;
    private double totalPrice;

    private ArrayList<OrderObserver> observers;

    public Order(int count, double totalPrice, ArrayList<OrderObserver> observers) {
    }

    public int getCount() {
    }

    public double getTotalPrice() {
    }

    public String toString() {
    }

    public void addItem(double price) {
    }

    public void removeItem(double price) {
    }

    public void attach(OrderObserver observer) {
    }

    public void detach(OrderObserver observer) {
    }

    public void setTotalPrice(double totalPrice) {
    }
}

