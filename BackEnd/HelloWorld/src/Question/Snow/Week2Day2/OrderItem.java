package Question.Snow.Week2Day2;

public class OrderItem {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;
    public OrderItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}
