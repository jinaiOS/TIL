package mission;

public class ChuncheonTicket2 {
    /**
     * Q2) 이 티켓 값은 얼마일까?
     * 전문가 4명이 제시하는 적정 티켓 값의 평균을 티켓 값으로 최종 책정하려고 한다.
     * 각각 제시한 티켓 값 Kim: 3000, Park: 5000, Lee: 2000, Hone: 2000
     */
    public static void main(String[] args) {
        int freeTicket = 625;
        int leftTicket = freeTicket % 3;
        int recipients = freeTicket / 3;

        System.out.println(leftTicket);
        System.out.println(recipients);
    }
}
