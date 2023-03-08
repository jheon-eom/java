package java_generic.fruit;

public class FruitBox<T> {
    T fruit;

    public T getFruit() {
        return this.fruit;
    }

    public void add(T fruit) {
        this.fruit = fruit;
    }
}
