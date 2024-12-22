package lesson_9_homework.task2;

public class Circle extends Figure{
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    private double radius;

    @Override
    public double calculationPerimeter() {
        System.out.println("The perimeter of a сircle is " + (2 * Math.PI * radius));
        return (2 * Math.PI * radius);
    }

    @Override
    public void calculationArea() {
        System.out.println("The area of a сircle is " + (Math.PI * radius * radius));
    }
}
