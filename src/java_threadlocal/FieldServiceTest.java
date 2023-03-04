package java_threadlocal;

import static java.lang.Thread.sleep;

public class FieldServiceTest {

    public static void main(String[] args) throws InterruptedException {
        FieldServiceThreadLocal fieldService = new FieldServiceThreadLocal();

        System.out.println("테스트 시작");
        Runnable userA = () -> {
            try {
                fieldService.logic("userA");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable userB = () -> {
            try {
                fieldService.logic("userB");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread threadA = new Thread(userA);
        threadA.setName("thread-A");
        Thread threadB = new Thread(userB);
        threadB.setName("thread-B");
        threadA.start();

//        sleep(2000); // 동시성 문제 발생 X
        sleep(100); // 동시성 문제 발생

        threadB.start();
        sleep(3000); // threadB가 끝날 때까지 메인 스레드 종료 지연
    }
}
