package effective.ch02.item06.number;

import java.util.regex.Pattern;

public class RomanNumerals {
    /**
     * 성능을 개선하기 위해서
     * 정규표현식을 표현하는 Pattern 인스턴스를
     * 클래스 초기화 과정에서 직접 생성해 캐싱해두고,
     * 나중에 isRomanNumeral 메서드가 호출될 때마다 재사용한다.
     */
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})" +
            "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
