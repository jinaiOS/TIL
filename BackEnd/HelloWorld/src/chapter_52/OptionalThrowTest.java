package chapter_52;

import java.util.Optional;

public class OptionalThrowTest {
    public static void main(String[] args) {
        String str = "abcdef";
        Optional<String> stringOptional = Optional.ofNullable("hello");

        int length = stringOptional.orElseThrow(() -> {
            throw new CustomException("CustomException");
        }).length();

        System.out.println(length);
    }
}
