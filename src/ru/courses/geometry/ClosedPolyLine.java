package ru.courses.geometry;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double getLength() {
        double sum = super.getLength();
        if (points.length >= 2) {
            double len1 = points[points.length - 1].x - points[0].x;
            double len2 = points[points.length - 1].y - points[0].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }

        return sum;
    }
}