package lesson_9_homework.Cloneable;

public class Point implements Cloneable {
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

        int x;
        int y;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

