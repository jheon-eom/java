package effective.ch02.item03.field;

public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public void print() {
        System.out.println("hello singleton!");
    }
}
