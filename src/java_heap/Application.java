package java_heap;

public class Application {
    SharedObj sharedObj = new SharedObj(); // 스프링 컨테이너에 빈으로 등록된 싱글톤 객체

    public static void main(String[] args) {
        Application application = new Application();
        application.Thread1();
        application.Thread2();

        System.out.println("싱글톤 ShareObj, count = " + application.sharedObj.getCount());
    }

    public void Thread1() {
        sharedObj.increase();
    }

    public void Thread2() {
        sharedObj.increase();
    }
}
