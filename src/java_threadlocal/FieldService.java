package java_threadlocal;

import static java.lang.Thread.sleep;

public class FieldService {
    private String nameStore;

    public String logic(String name) throws InterruptedException {
        System.out.println("저장 = " + name);
        System.out.println("nameStore = " + nameStore);
        nameStore = name;
        sleep(1000);
        System.out.println("조회 = " + nameStore);
        return nameStore;
    }
}
