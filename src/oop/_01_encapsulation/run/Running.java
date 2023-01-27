package oop._01_encapsulation.run;

public class Running {

    public static void main(String[] args) {
        /**
         * 객체 생성
         */
        Runner runner = new Runner();

        /**
         *  모두 실행 가능
         */
        runner.publicRun();
        runner.defaultRun();
        runner.protectedRun();

        /**
         * private 실행 불가
         */
//        runner.privateRun();

        /**
         * 내부에 private 메서드를 수행하는 public 메서드
         * public 메서드를 통해 내부 private 메서드 수행 가능
         */
        runner.compileTest();

        System.out.println("public state = " + runner.state);
        System.out.println("state = " + runner.state2);
        System.out.println("protected state = " + runner.state3);
//        System.out.println("private state = " + runner.state4); // 컴파일 에러!!

    }

}
