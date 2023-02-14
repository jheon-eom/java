package singleton.innerclass;

public class Singleton {
    private Singleton() {
//        throw new AssertionError();
    }

    public static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
