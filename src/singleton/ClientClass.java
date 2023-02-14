package singleton;

import singleton.innerclass.Singleton;

public class ClientClass {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
