package effective.ch03.item10.point;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof ColorPoint)) {
//            return false;
//        }
//        return super.equals(obj) &&
//                ((ColorPoint) obj).color == this.color;
//    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        if (!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }
        return super.equals(obj) && ((ColorPoint) obj).color == this.color;
    }

    public static void main(String[] args) {
//        ColorPoint cp = new ColorPoint(1, 2, Color.YELLOW);
//        System.out.println(cp.equals(new ColorPoint(1, 2, Color.RED)));

//        Point p = new Point(1, 2);
//        System.out.println(p.equals(new ColorPoint(1, 2, Color.YELLOW)));

        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.YELLOW);
//        p.equals(cp);
        cp.equals(new ColorPoint(1, 2, Color.YELLOW));
    }
}
