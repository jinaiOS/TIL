package mission;

public class ChuncheonTicket2 {
    public static void main(String[] args) {
        /**
         * Q2) 최대 몇 명까지 나눠줄 수 있고, 그 때 몇 장의 티켓이 남는가? (아주 인기가 많을 예정)
         * 시립 박물관 오픈기념으로 시청 근무자들에게 박물관 티켓 1112장 을 무료로 배포하려고 한다.
         * 이 때, 각각 개인은 ”4＂장의 티켓을 가져간다.
         */
        int freeTickets = 1111;
        int recipients = freeTickets / 4;
        int leftTicket = freeTickets % 4;

        System.out.println("티켓을 가져 갈수 있는 근무자들 수는? " + recipients);
        System.out.println("티켓을 다 나눠주고, 남는 티켓 수는? " + leftTicket);
    }
}