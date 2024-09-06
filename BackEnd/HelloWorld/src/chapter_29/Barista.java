package chapter_29;

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
