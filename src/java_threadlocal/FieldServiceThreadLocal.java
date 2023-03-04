package java_threadlocal;

import static java.lang.Thread.sleep;

public class FieldServiceThreadLocal {
    private ThreadLocal<String> nameStore = new ThreadLocal<>();

    public String logic(String name) throws InterruptedException {
        System.out.println("저장 = " + name);
        System.out.println("이름저장소 = " + nameStore.get());
        nameStore.set(name);
        sleep(1000);
        System.out.println("조회 = " + nameStore.get());
        return nameStore.get();
    }
}
