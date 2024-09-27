package chapter_43;

public class EqualTest {
    public static void main(String[] args) {

        Customer customer1 = new Customer("ID1", "민철");
        Customer customer2 = customer1;

        Customer customer3 = new Customer("ID1", "민철");

        // Customer{hello1='Hello', hello2='Hello2', customerID='ID1', name='민철', customerGrade='SILVER', bonusPoint=0, bonusPointRatio=0.01}
        // Customer{hello1='Hello', hello2='Hello2', customerID='ID1', name='민철', customerGrade='SILVER', bonusPoint=0, bonusPointRatio=0.01}
        System.out.println(customer1);
        System.out.println(customer3);

        // true
        // false
        System.out.println(customer1.equals(customer2));
        System.out.println(customer1.equals(customer3));
    }
}
