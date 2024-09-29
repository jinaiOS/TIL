package chapter_47;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

public class HashTest {
    public static String hashString(String input) {
        try {
            // MessageDigest 인스턴스 생성 (해시 알고리즘으로 SHA-256 선택)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Base64로 인코딩하여 해시된 문자열 반환
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String password= "q1we2e3r4t5";
        String hashPassword = hashString(password);

        // q1we2e3r4t5
        // /idgsaxzl8oXGcUIUd5yeCYLEMWvguWEe0bV4jlvzsY=
        System.out.println(password);
        System.out.println(hashPassword);

        // data 검색을 위한 hash
        long hashCode = Objects.hashCode(password);
        long hashCode2 = Objects.hashCode(2244);
        long hashCode3 = Objects.hashCode(new Customer("민철"));
        long hashCode4 = Objects.hashCode(new VIPCustomer("아이유"));

        // 1727805301
        // 2244
        // -679437325
        // 2634707
        System.out.println(hashCode);
        System.out.println(hashCode2);
        System.out.println(hashCode3);
        System.out.println(hashCode4);
    }
}
