package ru.courses.geometry;
import java.util.Objects;
public class Line implements Measurable, Cloneable{
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

//    public double length() {
//        double dx = end.x - start.x;
//        double dy = end.y - start.y;
//        return Math.sqrt(dx * dx + dy * dy);
//    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public double getLength() {
        double dx = end.x - start.x;
        double dy = end.y - start.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public Line clone() {
        try {
            Line clone = (Line) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
