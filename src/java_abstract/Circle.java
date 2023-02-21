package java_abstract;

public class Circle extends Shape {

    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1, 2);
        Circle c2 = new Circle(1, 2);
        System.out.println(c1.equals(c2));
    }
}
