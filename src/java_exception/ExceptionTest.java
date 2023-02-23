package java_exception;

public class ExceptionTest {
    public static void main(String[] args) {
        /**
         * print3 메서드가 실행될까?
         */
//        ExceptionTest et = new ExceptionTest();
//        et.print1();
//        et.print2();
//        et.exception();
//        et.print3();

        /**
         * print2 메서드가 실행될까?
         * 당연히 실행되지 않는다..!!!
         * 그러나 finally 키워드를 통해서 예외가 발생할 경우를 대비(?)할 수 있다.
         */
        ExceptionTest et2 = new ExceptionTest();
        try {
            et2.print1();
            et2.exception();
            et2.print2();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            et2.print3();
        }
    }

    void print1() {
        System.out.println("1번 메서드 실행");
    }

    void print2() {
        System.out.println("2번 메서드 실행");
    }

    void print3() {
        System.out.println("3번 메서드 실행");
    }

    void exception() {
        throw new RuntimeException();
    }
}
