package chapter_43;

public class ObjectTest {
    public static void main(String[] args) {
        Customer customer = new Customer("민철");
        // chapter_43.Customer@71be98f5
        // 오버라이딩 후: Customer(customerId=Customer1, name=민철, customerGrade=SILVER, bonusPoint=0)
        System.out.println(customer.toString());
    }
}
