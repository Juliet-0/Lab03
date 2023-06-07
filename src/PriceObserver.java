public class PriceObserver implements OrderObserver {

    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            System.out.println("20$ discount!");
            order.setTotalPrice(order.getTotalPrice() - 20);
        }
    }
}
