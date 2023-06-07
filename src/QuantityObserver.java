public class QuantityObserver implements OrderObserver {

    @Override
    public void update(Order order) {
        if (order.getCount() > 5) {
            System.out.println("Free shipping!");
        } else {
            System.out.println("Shipping cost: 10$");
            order.setTotalPrice(order.getTotalPrice() + 10);
        }
    }
}
