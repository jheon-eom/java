package effective.ch02.item01.staticmethod;

public interface MethodTest {

    void testA();

    static MethodTest create() {
//        return null;
        return new MethodTestImpl();
    }

}
