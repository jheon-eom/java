package oop._05_ocp.good;

public class Driver {

    /**
     * 드라이버는 차를 바꿔 타게 되더라도 코드를 변경할 필요가 없음
     */
//    private final Car car3 = new Avante();
//    private final Car car2 = CarStore.getCar();
    private final Car car;

    public Driver(Car car) {
        this.car = car;
    }

    void driving() {
        car.run();
    }

}
