package chapter_43;

public class VIPCustomer extends Customer {
    static int serialNums;

    // 속성

    private String agentID;
    private double discountRatio;

    // 행위
    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * bonusPointRatio;
        return price;
    }

    public void callAgent() {
        System.out.println("담당직원 " + this.agentID + "님 문의드릴 게 있어요~");
    }

    public VIPCustomer(String name) {
        super();
        this.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    void printMyInfo() {
        System.out.print("VIP");
        super.printMyInfo();
    }
}