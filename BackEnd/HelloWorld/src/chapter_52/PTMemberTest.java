package chapter_52;

public class PTMemberTest {
    public static void main(String[] args) {
        PTMember member = new PTMember("민철", 170, 70, "Male");

        member.setID(null);
        // Exception in thread "main" chapter_51.exceptions.PositiveNumberException: 키는 0 이하일 수 없습니다.
        // Exception in thread "main" chapter_51.exceptions.IDFormatException: ID는 null이 될 수 없습니다.
        System.out.println(member);
    }
}
