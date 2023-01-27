package oop._04_srp.calculator.bad;

public class Calculator {

    /**
     * 해당 계산기는 사칙연산 기능과 결과 출력까지 수행하고 있음
     * 이 클래스를 변경해야 한다면 그 원인은 어떤 것들이 있을지?
     * 1. 계산 기능이 변경될 경우
     * 2. 출력 방식이 변경될 경우
     * 결국 이 계산기는 계산과 출력 두 가지의 책임을 갖고 있다.
     */
    public void calculate(int left, int right, String operator) {
        if (operator.equals("+")) {
            System.out.println(left + right);
        } else if (operator.equals("-")) {
            System.out.println(left - right);
        } else if (operator.equals("*")) {
            System.out.println(left * right);
        } else if (operator.equals("/")) {
            System.out.println(left / right);
        }
    }

}
