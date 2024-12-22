package lesson_9_homework.task2;

public class Rectangle extends Figure{
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculationPerimeter() {
        System.out.println("The perimeter of a rectangle is " + ((side1 + side2)*2));
        return ((side1 + side2)*2);
    }

    @Override
    public void calculationArea() {
        System.out.println("The area of a rectangle is " + (side1 * side2));
    }
}

