package oop._04_srp.bike.bad;

public class Bike {

    /**
     * 자전거를 구현하는 클래스
     * 2개의 바퀴를 가진 자전거와 4개의 바퀴를 가진 자전거를 구현
     */

    private final static int TWO_WHEEL = 2;
    private final static int FOUR_WHEEL = 4;

    /**
     * run 메서드에서 2바퀴를 가진 자전거와 4바퀴를 가진 자전거의 행위를 모두 구현하고 있음
     * 이는 단일책임원칙(SRP)을 위반하였음
     */
    public void run(int wheel) {
        if (wheel == TWO_WHEEL) {
            // 두 바퀴로 가는 자전거
        } else if (wheel == FOUR_WHEEL) {
            // 네 바퀴로 가는 자전거
        } else {
            // 사용할 수 없는 자전거
        }
    }

}
