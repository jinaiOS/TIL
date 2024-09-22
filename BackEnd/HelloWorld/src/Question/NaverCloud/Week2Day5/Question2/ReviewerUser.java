package Question.NaverCloud.Week2Day5.Question2;

public class ReviewerUser extends User implements CustomerRole, ReviewerRole {
    public ReviewerUser(String username) {
        super(username);
    }

    @Override
    public void order() {
        System.out.printf("유저(%s)은 주문을 할 수 있습니다.\n", username);
    }

    @Override
    public void payment() {
        System.out.printf("유저(%s)은 결제를 할 수 있습니다.\n", username);
    }
}
