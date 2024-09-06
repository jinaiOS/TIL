# Java 객체 간의 협력
## 커피 주문상황에서 객체 설계

1. 시나리오 쓰기
2. 객체 후보 뽑아 내기
3. 각 객체 분석하기
    1. 속성
    2. 행위
4. 객체 구현하기

## 설계한 객체로 로직 구현하기

```java
public class Coffee {
    // 속성
    private String coffeeName;
    private long waterQuantity; // ml 단위
    private long coffeeBeanQuantity; // 원두의 양 g 단위
    private boolean isWrappedUp; // 포장됨 여부

    // 행위
    void beWrappedUp() {
        this.isWrappedUp = true;
    }

    // 생성자
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false;
    }

    public String getCoffeeName() {
        return coffeeName;
    }
}
```

```java
public class Barista {
    // 속성

    // 행위
    public void noticeOrder(String coffeeName) {
        System.out.println("바리스타: 커피주문 확인했습니다. 커피:" + coffeeName);
    }

    // 생성자
    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
        Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
        return coffee;
    }

    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작이 완료되었습니다. 커피: " + coffeeName);
    }
}
```

```java
public class Casher {
    // 속성
    private long salesAmount;

    // 행위
    public long checkCoffeePrice(String coffeeName) {
        long price;
        switch (coffeeName) {
            case "아메리카노":
                price = 5000;
                break;
            case "카페라떼":
                price = 6000;
                break;
            case "카페모카":
                price = 6500;
                break;
            case "카푸치노":
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, int price) {
        if (price == 0) {
            System.out.println("캐시어: 죄송합니다. 손님 말씀하신 메뉴: " + coffeeName + " 는 저희 가게에 없습니다.");
        } else {
            System.out.println("캐시어: 말씀하신 커피 " + coffeeName + "은 가격이" + price + "입니다.");
        }
    }

    public void addAmount(int money) {
        this.salesAmount += money;
    }

    public void sayOrder(String coffeeName) {
        System.out.println("캐시어: 커피 " + coffeeName + " 주문이 들어왔습니다.");
    }

    public Coffee wrapUpCoffee(Coffee coffee) {
        coffee.beWrappedUp();
        return coffee;
    }

    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("캐시어: 주문하신 커피 " + coffeeName + " 준비가 완료되었습니다.");
    }
}
```

```java
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
```
