package effective.ch02.item06.number;

public class ExNumber {

    /**
     * matches 메서드 내부의 Pattern 인스턴스는 한 번 쓰고 버려져서
     * 곧바로 가비지 컬렉터의 대상이 된다.
     * Pattern은 입력받은 정규표현식에 해당하는 유한 상태 머신을 만들기 때문에
     * 생성 비용이 높다..!
     */
    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
}
