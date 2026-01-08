package ru.courses.math;

import ru.courses.geometry.Line;
import ru.courses.geometry.Point;

import java.util.Objects;

public class Fractionnew implements Cloneable{
    int num,denum;

    public Fractionnew(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fractionnew fraction1 = (Fractionnew) o;
        return num == fraction1.num && denum == fraction1.denum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, denum);
    }

    public String toString() {
        return num + "/" + denum;
    }
    @Override
    public Fractionnew clone() {
        try {
            Fractionnew clone = (Fractionnew) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}