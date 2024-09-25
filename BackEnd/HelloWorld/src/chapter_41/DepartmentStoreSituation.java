package chapter_41;

public class DepartmentStoreSituation {
    public static void main(String[] args) throws InterruptedException {
        // 전제 상황
        // Customer(customerId=Customer1, name=권율, customerGrade=SILVER, bonusPoint=0)
        // 내가 내는 금액은 : 10000
        // Customer(customerId=Customer2, name=이순신, customerGrade=SILVER, bonusPoint=0)
        // 내가 내는 금액은 : 10000
        // VIPCustomer(customerId=VIP1, name=광해군, customerGrade=VIP, bonusPoint=0)
        // 내가 내는 금액은 : 9500
        // VIPCustomer(customerId=VIP0, name=아이유, customerGrade=VIP, bonusPoint=0)
        // 내가 내는 금액은 : 9500
        // Customer(customerId=Customer3, name=김좌진, customerGrade=SILVER, bonusPoint=0)
        // 내가 내는 금액은 : 10000
        // VIPCustomer(customerId=VIP0, name=아이유, customerGrade=VIP, bonusPoint=500)
        // 내가 내는 금액은 : 9500
        // Customer(customerId=Customer4, name=장원영, customerGrade=SILVER, bonusPoint=0)
        // 내가 내는 금액은 : 10000
        // Customer(customerId=Customer5, name=안유진, customerGrade=SILVER, bonusPoint=0)
        // 내가 내는 금액은 : 10000
        // VIPCustomer(customerId=VIP2, name=김지은, customerGrade=VIP, bonusPoint=0)
        // 내가 내는 금액은 : 9500
        // Customer(customerId=Customer6, name=정우성, customerGrade=GOLD, bonusPoint=0)
        // 내가 내는 금액은 : 9700
        // Customer(customerId=Customer7, name=정우영, customerGrade=GOLD, bonusPoint=0)
        // 내가 내는 금액은 : 9700
        // Customer(customerId=Customer8, name=손흥민, customerGrade=GOLD, bonusPoint=0)
        // 내가 내는 금액은 : 9700
        // 오늘의 최종 매상은 1117100
        int price = 10000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer1 = new VIPCustomer("아이유");

        Customer[] customerQueue = {
                new Customer("권율"), new Customer("이순신"), new VIPCustomer("광해군"),
                customer1, new Customer("김좌진"), customer1,
                new Customer("장원영"), new Customer("안유진"), new VIPCustomer("김지은"),
                new GolderCustomer("정우성"), new GolderCustomer("정우영"), new GolderCustomer("손흥민")
        };

        // 시나리오
        for (Customer customer : customerQueue) {
            customer.printMyInfo();
            int cash = staff.helpPayment(customer, price);
            System.out.printf("내가 내는 금액은 : %d\n", cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();

        while (true) {
            Thread.sleep(100);
        }
    }
}
