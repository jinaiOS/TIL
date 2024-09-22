package chapter_37;

public class InterfaceTest {
    public static void main(String[] args) {
        // Male 3개 남편, 아빠, 회사원
        HusbandRole male = new Male("철수");
        Wife female = new Female("아이유");

        // 우리 아기 사랑합니다~
        // 우리 가족 사랑합니다~
        // 아이유인 아내를 성심성의껏 케어합니다.
        male.sayLoveEveryDay();
        male.takeCareWife(female);

        // 이어서 아빠
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("정우성");

        // 정우성 아기를 열심히 교육하고 있습니다.
        // 우리 아기 사랑합니다~
        // 우리 가족 사랑합니다~
        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryDay();

        // 회사원
        EmployeeRole employeeRole = (EmployeeRole) maleDaddy;
        EmployeeRole maleEmployeeRole = new MaleTwo("찰스");

        // 찰스인 직장동료와 업무를 하고 있습니다.
        employeeRole.workTogether(maleEmployeeRole);
    }
}
