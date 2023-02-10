package _java._03_static;

public class App {

    public static void main(String[] args) {
        Test.sm(); // 가능
//        Test.m(); // 컴파일 에러

        /**
         * 유틸리티 메서드를 만들 때 유용함
         * 대표적으로 Math 클래스가 있음
         *
         * 인스턴스를 생성하지 않고 호출할 경우에 스태틱 메서드 사용을 고려할 것
         * 1. 변화를 가정하지 않는다.
         * 2. 메서드가 인스턴스 변수를 사용하지 않는다.
         * 3. 인스턴스 생성에 의존하지 않는다.
         * 4. 메서드가 공유되고 있다면, 정적 메서드로 추출해낼 수 있다.
         * 5. 메서드가 변화되지 않고, 오버라이딩 되지 않는다.
         */

        MyTest myTest = new MyTest();
        MyTest.InnerClass mi = new MyTest.InnerClass();
    }

}
