package chapter_34;

public class Test {
    public static void main(String[] args) {
        // Customer(customerId=Customer1, name=나철수, customerGrade=SILVER, bonusPoint=0)
        // VIPCustomer(customerId=VIP0, name=나관중, customerGrade=VIP, bonusPoint=0)
        // Customer(customerId=Customer1, name=나영희, customerGrade=SILVER, bonusPoint=0)
        Customer customer = new Customer("나철수");
        VIPCustomer vipCustomer = new VIPCustomer("나관중");
        Customer customer2 = new Customer("나영희");

        customer.printMyInfo();
        vipCustomer.printMyInfo();
        customer2.printMyInfo();
    }
}
