package chapter_41;

public class Staff {
    // 속성
    private int salesAmount;

    // 행위
    public int helpPayment(Customer customer, int price) {
        return customer.calculatePrice(price);
    }

    public int helpPayment(VIPCustomer vipCustomer, int price) {
        return vipCustomer.calculatePrice(price);
    }

    public void addSalesAmount(int cash) {
        salesAmount += cash;
    }

    public void printMySalesAmount() {
        System.out.println("오늘의 최종 매상은 " + this.salesAmount);
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }
}
