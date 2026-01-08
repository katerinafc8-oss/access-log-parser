package ru.courses.geometry;

import java.util.Arrays;
import java.util.Objects;

public class PolyLine implements Measurable{

    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

//    public double length() {
//        double sum = 0;
//        for (int i = 0; i < points.length - 1; i++) {
//            double dx = points[i + 1].x - points[i].x;
//            double dy = points[i + 1].y - points[i].y;
//            sum += Math.sqrt(dx * dx + dy * dy);
//        }
//        return sum;
//    }

    public Line[] getLines() {
        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        return lines;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine polyLine = (PolyLine) o;
        return Objects.deepEquals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    @Override

    public double getLength() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double dx = points[i + 1].x - points[i].x;
            double dy = points[i + 1].y - points[i].y;
            sum += Math.sqrt(dx * dx + dy * dy);
        }
        return sum;
    }
}
