package chapter_16;

public class AvocadoSituation {
    public static void main(String[] args) {
        // 장보고 돌아왔어 6 개 아보카도, 1 개 우유 사왔어
        // 장보고 돌아왔어 0 개 아보카도, 1 개 우유 사왔어
        // 장보기 전
        int milks = 0; // 우유 0 개
        int avocados = 0; // 아보카도 0 개
        boolean existedAvocado = false; // 아보카도 있는가 true

        // 장보기
        milks = 1;
//        if(existedAvocado) {
//            avocados = avocados + 6;
//        }

        avocados = (existedAvocado) ? 6 : 0;

        // 집으로 돌아오기
        String comment = String.format("장보고 돌아왔어 %d 개 아보카도, %d 개 우유 사왔어", avocados, milks);
        System.out.println(comment);
    }
}
