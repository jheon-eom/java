package oop._05_ocp.good;

public class CarStore {

    /**
     * 자동차 창고에서 원하는 차만 교체해주면 됨
     * 스프링의 AppConfig와 같은 원리!
     */
    public static Car getCar() {
        return new Avante();
    }



}
