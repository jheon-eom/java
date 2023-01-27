package oop._04_srp.good;

/**
 * 추상클래스 선언
 * 추상클래스 선언을 통해 해당 공통적으로 구현해야할 메서드를 정의
 * 해당 클래스를 상속받은 자식클래스는 각자의 책임과 역할에 따라 해당 메서드 구현
 */
abstract class Bike {

    abstract void run(int wheel);

}
