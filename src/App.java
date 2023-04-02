import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        EnumTest a = EnumTest.SIGN_SATE;
        EnumTest b = EnumTest.B;
        EnumTest c = EnumTest.C;

        List<EnumTest> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        list.sort(Comparator.comparingInt(EnumTest::getOrder));

        for (EnumTest en : list) {
            System.out.println(en);
        }
    }
}
