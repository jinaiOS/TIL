package chapter_29;

// 손님 현금: 5만원
// 예상: 100만원
// 손님: 커피 카푸치노 얼마인가요?
// 캐시어: 말씀하신 커피 카푸치노은 가격이 6000 입니다.
// 손님: 커피 카푸치노를 주문할게요 단, 포장 여부는 true 으로 부탁드려요.
// 캐시어: 커피 카푸치노 주문이 들어왔습니다.
// 바리스타: 커피주문 확인했습니다. 커피:카푸치노
// 바리스타: 커피 제작이 완료되었습니다. 커피: 카푸치노
// 캐시어: 주문하신 커피 카푸치노 준비가 완료되었습니다.
// 손님: 나는 커피 카푸치노을 마신다.
// 손님: 지금 나의 기분은 기분이 좋아요. 하고, 현금은 44000 있습니다.
public class CoffeeShopSituation {
    public static void main(String[] args) {
        // 인스턴스화

        Customer customer = new Customer();
        customer.setCashAmount(50_000);

        Casher casher = new Casher();
        casher.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        // 시작
        String coffeeName = "카푸치노";
        boolean isTakeout = true;
        customer.askCoffee(casher, coffeeName);

        long price = casher.checkCoffeePrice(coffeeName);
        casher.replyCoffeePrice(coffeeName, price);

        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName, isTakeout);

        casher.addAmount(cash);
        casher.sayOrder(coffeeName);

        barista.noticeOrder(coffeeName);
        Coffee coffee = barista.makeUpCoffee(coffeeName, 500, 30);
        barista.sayCoffeeReady(coffee);

        Coffee coffeeComplete = casher.wrapUpCoffee(coffee);
        casher.sayCoffeeReady(coffeeComplete);

        customer.drinkCoffee(coffeeComplete);
        if (coffeeComplete.getCoffeeName() == coffeeName && coffeeComplete.isWrappedUp() == isTakeout) {
            customer.upgradeMyFeeling();
        }
        customer.showMyInfo();
    }
}
