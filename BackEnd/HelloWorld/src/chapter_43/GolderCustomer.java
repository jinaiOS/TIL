package chapter_43;

public class GolderCustomer extends Customer {
    private double discountRatio;

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    GolderCustomer(String name) {
        super();
        this.customerID = "Customer" + Customer.serialNums++;
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.discountRatio = 0.03;
        this.bonusPointRatio = 0.03;
    }

    @Override
    public String toString() {
        return String.format("Customer(customerId=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n", this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }
}
