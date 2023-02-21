package effective.ch03.item10.point;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        return p.x == this.x && p.y == this.y;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null || obj.getClass() != getClass()) {
//            return false;
//        }
//        Point p = (Point) obj;
//        return p.x == this.x && p.y == this.y;
//    }
}
