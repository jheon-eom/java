package effective.ch03.item10.point.composition;

import effective.ch03.item10.point.Color;
import effective.ch03.item10.point.Point;

import java.util.Objects;

public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint() {
        return this.point;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) obj;
//        return cp.point.equals(this.point) && cp.color.equals(this.color);
        return this.point.equals(cp.point) && this.color.equals(cp.color);
    }
}
