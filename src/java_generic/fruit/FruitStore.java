package java_generic.fruit;

public class FruitStore {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>(); // 과일 상자
        FruitBox<Apple> appleFruitBox = new FruitBox<>(); // 사과 상자
        FruitBox<Banana> bananaFruitBox = new FruitBox<>(); // 바나나 상자

        Apple apple = new Apple();
        Banana banana = new Banana();

        fruitBox.add(apple);
        fruitBox.add(banana);
    }
}
