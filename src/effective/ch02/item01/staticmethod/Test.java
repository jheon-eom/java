package effective.ch02.item01.staticmethod;

import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {
        /**
         * 인터페이스의 정적 팩토리 메서드 사용
         * 메서드의 하위타입을 반환할 수 있음 (스프링에선 DI, IoC를 통해 가능)
         */
        MethodTest method = MethodTest.create();

        /**
         * 정적 팩토리 메서드 사용 예제
         */
        LocalDateTime date = LocalDateTime.now();

        /**
         * 반환할 객체가 존재하지 않아도 된다.
         * 당장 구현해야할 클래스가 아닐 때..?
         */
        MethodTest methodTest = MethodTest.create();
    }

}
