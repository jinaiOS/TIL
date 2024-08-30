# Java 조건문
## If문, If-else문
![avocardo](https://github.com/user-attachments/assets/ea7dfa5e-c225-4ce1-89fd-dec4f2bd0b1d)


```java
public class AvocadoSituation {
    public static void main(String[] args) {
        // 장보고 돌아왔어 6 개 아보카도, 1 개 우유 사왔어
        // 장보기 전
        int milks = 0; // 우유 0 개
        int avocados = 0; // 아보카도 0 개
        boolean existedAvocado = true; // 아보카도 있는가 true

        // 장보기
        milks = 1;
        if(existedAvocado) {
            avocados = avocados + 6;
        }

        // 집으로 돌아오기
        String comment = String.format("장보고 돌아왔어 %d 개 아보카도, %d 개 우유 사왔어", avocados, milks);
        System.out.println(comment);
    }
}
```

```java
public class ParkingLotMission {
    public static void main(String[] args) {
        // 고객님 1 를 사용했기 때문에, 200000 시간을 결제 하셔야 합니다.
        int useMoney = 200_000;
        int parkingTime = 6;

        if (useMoney >= 200_000) {
            parkingTime = parkingTime - 5;
        } else if (useMoney >= 100_000) {
            parkingTime = parkingTime - 4;
        } else if (useMoney >= 50_000) {
            parkingTime = parkingTime - 3;
        } else if (useMoney >= 30_000) {
            parkingTime = parkingTime - 2;
        } else if (useMoney >= 10_000) {
            parkingTime = parkingTime - 1;
        }

        String result = String.format("고객님 %d 를 사용했기 때문에, %d 시간을 결제 하셔야 합니다.", parkingTime, useMoney);
        System.out.println(result);
    }
}
```

## 삼항 연산자

- 조건문 ? 값: 값2

```java
public class AvocadoSituation {
    public static void main(String[] args) {
        // 장보고 돌아왔어 0 개 아보카도, 1 개 우유 사왔어
        // 장보기 전
        int milks = 0; // 우유 0 개
        int avocados = 0; // 아보카도 0 개
        boolean existedAvocado = false; // 아보카도 있는가 true

        // 장보기
        milks = 1;

        avocados = (existedAvocado) ? 6 : 0;

        // 집으로 돌아오기
        String comment = String.format("장보고 돌아왔어 %d 개 아보카도, %d 개 우유 사왔어", avocados, milks);
        System.out.println(comment);
    }
}
```

## switch문

```java
public class Medal {
    public static void main(String[] args) {
        // 메달 수여
        // 선수님의 메달 색깔은 동메달 입니다.
        int myRank = 3;
        String medal;

        switch (myRank) {
            case 1:
                medal = "금메달";
                break;
            case 2:
                medal = "은메달";
                break;
            case 3:
                medal = "동메달";
                break;
            default:
                medal = "메달 없음";
                break;
        }

        String result = String.format("선수님의 메달 색깔은 %S 입니다.", medal);
        System.out.println(result);
    }
}
```

## 연속, 중첩 if문

```java
public class Taxi {
    public static void main(String[] args) {
        // 심야 할증구간 0~4시
        // 시외 할증 기준: 서울 X, 서울 외곽 O
        // 고객님이 내셔야할 돈은 14400 입니다.
        int goHomeTime = 3;
        String myHome = "용인";
        int payment = 10_000;

        if (0 < goHomeTime && goHomeTime < 4) {
            payment = payment + (int) (payment * 0.2); // 10,000 -> 12,000
        }
        if (myHome != "서울") {
            payment = payment + (int) (payment * 0.2); // 12,000 + 2,400 = 14,400
        }

        String result = String.format("고객님이 내셔야할 돈은 %d 입니다.", payment);
        System.out.println(result);
    }
}
```

```java
public class StarbucksCoupon {
    public static void main(String[] args) {
        // 스타벅스 쿠폰 이벤트 신청할 수 있게 됐습니다.
        boolean clearCondition1 = true;
        boolean clearCondition2 = true;
        boolean clearCondition3 = true;
        boolean clearCondition4 = true;

        if (clearCondition1 && clearCondition2 && clearCondition3 && clearCondition4) {
            System.out.println("스타벅스 쿠폰 이벤트 신청할 수 있게 됐습니다.");
        } else {
            System.out.println("아니요, 내돈내산 하겠습니다.");
        }
    }
}
```
