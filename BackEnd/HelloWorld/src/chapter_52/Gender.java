package chapter_52;

public enum Gender {
    FEMALE("female", "여자"),
    MALE("male", "남자"),
    UNKNOWN("unknown", "미정");

    private String englishTerm;
    private String koreanTerm;

    Gender(String englishTerm, String koreanTerm) {
        this.englishTerm = englishTerm;
        this.koreanTerm = koreanTerm;
    }

    public static Gender valueOfTerm(String str) {
        for(Gender gender: values()) {
            if (str.equals(gender.englishTerm) || str.equals(gender.koreanTerm)) {
                return gender;
            }
        }
        return UNKNOWN;
    }
}
