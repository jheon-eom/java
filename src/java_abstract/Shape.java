package java_abstract;

abstract class Shape {
    int x;
    int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) {
            return false;
        }
        return this.x == ((Shape) obj).x &&
                this.y == ((Shape) obj).y;
    }
}
