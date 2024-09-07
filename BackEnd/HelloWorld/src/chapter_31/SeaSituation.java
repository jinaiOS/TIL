package chapter_31;

public class SeaSituation {
    // 물고기(sex=Male, havingPoison=false, leavingSea=동해)
    //
    // 물고기(sex=Female, havingPoison=true, leavingSea=서해)
    //
    // 물고기(sex=Female, havingPoison=true, leavingSea=서해)
    // 가 모래를 파고 있습니다.
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setSex("Male");
        fish1.setLeavingSea("동해");
        fish1.setHavingPoison(false);

        FishChild fish2 = new FishChild();
        fish2.setSex("Female");
        fish2.setLeavingSea("서해");
        fish2.setHavingPoison(true);

        fish1.printMyInfo();
        fish2.printMyInfo();

        fish2.digging();
    }
}
