package chapter_32.fish;

public class FishChild extends Fish {
    private boolean eatable;
    protected String leavingSeaChild;

    // 새로운 메소드
    public void digging() {
        System.out.println(myInfo() + "가 모래를 파고 있습니다.");
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void becomeDanger() {
        this.havingPoison = true;
    }

    @Override
    void eat(String food) {
        System.out.printf("나, 물고기는 %s를 아주 열심히 먹고 있습니다.\n", food);
    }

    @Override
    String myInfo() {
        return super.myInfo() + "는 부모 물고기, " + String.format("자식 물고기(eatable=%b, leavingSea=%s)", this.eatable, this.leavingSeaChild);
    }

    void printSea() {
        System.out.println(myInfo() + "는 " + this.leavingSeaChild + "바다 출신이고, " + "부모 물고기는 " + this.leavingSea + "바다 출신이야.");
    }

    public void setLeavingSeaChild(String leavingSeaChild) {
        this.leavingSeaChild = leavingSeaChild;
    }

    FishChild() {
        super(); // 부모 물고기가 만들어지고 있습니다.
        System.out.println("자식 물고기가 생성되고 있습니다.");
    }

    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
        this.leavingSeaChild = leavingSea;
    }

    FishChild(String sex, boolean eatable, String leavingSea) {
        super(sex, false, "2022", "2022", leavingSea);
        this.eatable = eatable;
    }
}