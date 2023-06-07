import java.util.ArrayList;

public class Order {
    private int count;
    private double totalPrice;
    private final int id;
    private ArrayList<OrderObserver> observers;

    public Order(int id, int count, double totalPrice, ArrayList<OrderObserver> observers) {
        this.id = id;
        this.count = count;
        this.totalPrice = totalPrice;
        this.observers = observers;
    }

    public int getCount() {
        return this.count;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String toString() {
        System.out.println("Order n°"+ this.id + ": " + this.count + " quantity for " + this.totalPrice + " $");
        return null;
    }

    public void addItem(double price) {
        this.count++;
        this.totalPrice += price;
        this.observers.forEach(observer -> observer.update(this));
    }

    public void removeItem(double price) {
        this.count--;
        this.totalPrice -= price;
        this.observers.forEach(observer -> observer.update(this));
    }

    public void attach(OrderObserver observer) {
        this.observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        this.observers.remove(observer);
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
