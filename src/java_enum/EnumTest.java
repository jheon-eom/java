package java_enum;

public class EnumTest {

    public static void main(String[] args) {
        double good = BadEnum.PLUS.apply(1, 2);
        double bad = GoodEnum.PLUS.apply(1.0, 2.0);
        double apply = FunctionalEnum.PLUS.apply(1.0, 2.0);

        FunctionalEnum plus = FunctionalEnum.PLUS;
        BinaryCalculator bc = plus.getFn();
        double apply1 = bc.apply(1.0, 2.0);

        // 기대값 3.0이 출력되는지 생각하기
        System.out.println(apply1);
    }

}
