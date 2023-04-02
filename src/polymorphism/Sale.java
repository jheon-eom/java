package polymorphism;

public class Sale {

    public static void main(String[] args) {
//        Tv tv = new Tv();
//        Computer computer = new Computer();

        Product tv = new Tv();
        Product computer = new Computer();

        Product[] products = new Product[2];
        products[0] = tv;
        products[1] = computer;
    }
}
