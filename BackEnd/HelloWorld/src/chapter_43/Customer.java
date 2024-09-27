package chapter_43;

public class Customer {
    // 속성
    static int serialNums = 1;

    String hello1 = "Hello";
    String hello2 = "Hello2";

    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    // 행위
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer() {}

    Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;
    }

    Customer(String name) {
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    void printMyInfo() {
        System.out.printf("Customer(customerId=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n", this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

//    @Override
//    public String toString() {
//        return String.format("Customer(customerId=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n", this.customerID, this.name, this.customerGrade, this.bonusPoint);
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "hello1='" + hello1 + '\'' +
                ", hello2='" + hello2 + '\'' +
                ", customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }
        return false;
    }
}
