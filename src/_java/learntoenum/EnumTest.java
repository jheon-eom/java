package _java.learntoenum;

public class EnumTest {

    public static void main(String[] args) {
        double good = BadEnum.PLUS.apply(1, 2);
        double bad = GoodEnum.PLUS.apply(1.0, 2.0);
    }

}
