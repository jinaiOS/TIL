package chapter_52;

import chapter_51.exceptions.IDFormatException;
import chapter_51.exceptions.PositiveNumberException;

import java.time.LocalDateTime;

public class PTMember {
    private String ID;
    private String name;
    private Integer heigth;
    private Integer weight;
    private Gender gender;
    private LocalDateTime enrollTime;

    public PTMember(String name, Integer heigth, Integer weight, String gender) {
        if (heigth <= 0) throw new PositiveNumberException("키는 0 이하일 수 없습니다.");
        if (weight <= 0) throw new PositiveNumberException("몸무게는 0 이하일 수 없습니다.");
        this.name = name;
        this.heigth = heigth;
        this.weight = weight;
        this.gender = Gender.valueOfTerm(gender);
        this.enrollTime = LocalDateTime.now();
    }

    public void setID(String ID) {
        if (ID == null) throw new IDFormatException("ID는 null이 될 수 없습니다.");
        if (ID.length() < 8 && ID.length() > 20) throw new IDFormatException("ID는 8자 이하 및 20자 이상이 될 수 없습니다.");
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PTMember{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", heigth=" + heigth +
                ", weight=" + weight +
                ", gender=" + gender +
                ", enrollTime=" + enrollTime +
                '}';
    }
}
