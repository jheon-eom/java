package oop._01_encapsulation.run;

public class Runner {

    public String state = "숨이 찬다";
    String state2 = "사실 숨이 조금 찬다";
    protected String state3 = "사실 숨이 덜 찬다";
    private String state4 = "사실 숨이 많이 찬다";

    public void compileTest() {
        publicRun();
        defaultRun();
        protectedRun();
        privateRun();
    }

    public void publicRun() {
        System.out.println("run !!!");
    }

    void defaultRun() {
        System.out.println("디폴트 run !!!");
    }

    protected void protectedRun() {
        System.out.println("상속 받으면 run !!!");
    }

    private void privateRun() {
        System.out.println("클래스 내부에서만 run !!!");
    }

}
