package lesson_9_homework.task2;

public class MyMain {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(2,3,2);
        figures[1]  = new Rectangle(3,4);
        figures[2] = new Circle(3);
        figures[3]  = new Rectangle(3,6);
        figures[4] = new Circle(4);

        double sumPerimetr = 0;

        for(Figure figure: figures) {
            figure.calculationArea();
            figure.calculationPerimeter();
            sumPerimetr += figure.calculationPerimeter();
        }

        System.out.println("Total perimeter of all figures: " + sumPerimetr);
    }
}
