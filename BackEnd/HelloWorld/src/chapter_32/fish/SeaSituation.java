package chapter_32.fish;

public class SeaSituation {
    // 부모 물고기가 만들어지고 있습니다.
    // 자식 물고기가 생성되고 있습니다.
    // 물고기(sex=Male, havingPoison=false, leavingSea=동해)
    // 물고기(sex=Female, havingPoison=false, leavingSea=서해)
    // 부모 물고기가 만들어지고 있습니다.부모 물고기가 만들어지고 있습니다.
    // 물고기(sex=null, havingPoison=false, leavingSea=동해)
    // 는 부모 물고기, 자식 물고기(eatable=true, leavingSea=서해)는 서해바다 출신이고, 부모 물고기는 동해바다 출신이야.
    public static void main(String[] args) {
        // 자식 물고기
        FishChild fishChild = new FishChild();
        fishChild.setSex("Male");
        fishChild.setEatable(true);
        fishChild.setLeavingSea("동해");

        fishChild.printMyInfo();

        // 생성자 오버로딩
        FishChild fishChild2 = new FishChild("Female", true, "서해");
        fishChild2.printMyInfo();

        FishChild fishChild3 = new FishChild(true, "서해");
        fishChild3.setLeavingSea("동해");
        fishChild3.setLeavingSeaChild("서해");

        fishChild3.printSea();

        // 타입선언: 부모, 인스턴스화: 자식
        // 타입선언: 부모, 인스턴스화: 부모
        // 타입선언: 자식, 인스턴스화: 자식
        // 타입선언: 자식, 인스턴스화: 부모 => 묵시적 변환 x
        Fish fish1 = new Fish();
        fish1.eat("새우");

        Fish fish2 = new FishChild();
        fish2.eat("새우");

        FishChild fish3 = new FishChild();
        fish3.eat("새우");

//        FishChild fish4 = new Fish();
//        fish4.eat("새우");
    }
}
