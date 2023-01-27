package oop._00_memory;

class Eom {

    /**
     * 클래스 변수 (cv)
     */
    public String pubState = "so good";
    String state = "soso";
    protected String proState = "not bad";
    private String priState = "bad";

    public void statePrint() {
        // 지역변수에 접근제어자 쓸 수 없음 (쓸 필요가 없음)
        String ivState = "제 상태는";

        System.out.println(ivState);
        System.out.println("사회생활 = " + pubState);
        System.out.println("친구들 = " + state);
        System.out.println("부모님께 = " + proState);
        System.out.println("사실 = " + priState);
    }

}
