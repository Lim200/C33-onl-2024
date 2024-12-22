package lesson_9_homework.task2;

public class Triangle extends Figure {
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double side1;
    private double side2;
    private double side3;

    @Override
    public double calculationPerimeter() {
        System.out.println("The perimeter of a triangle is " + (side1 + side2 + side3));
        return (side1 + side2 + side3);
    }

    @Override
    public void calculationArea() {
        double semiperimeter = (side1 + side2 + side3)/2;
        double area = Math.sqrt(semiperimeter * (semiperimeter - side1) *
                (semiperimeter - side2) * (semiperimeter - side3));
        System.out.println("The area of a triangle is " + area);
    }
}
