package java_static.factoerymethod;

public class Judge {
    private int id;
    private String name;
    private String intro;

    public Judge(int id, String name, String intro) {
        this.id = id;
        this.name = name;
        this.intro = intro;
    }

    public static Judge create(int id, String name, String intro) {
        return new Judge(id, name, intro);
    }

    public static void main(String[] args) {
        Judge judge1 = new Judge(1, "A", "A");
        Judge judge2 = new Judge(1, "A", "A");

        // 갖고 있는 주소값은 당연히 다름
        System.out.println(judge1);
        System.out.println(judge2);

        // 정적 팩토리 메소드 사용
        Judge judge3 = Judge.create(3, "B", "B");
        Judge judge4 = Judge.create(4, "C", "C");
        System.out.println(judge3);
        System.out.println(judge4);
    }
}
