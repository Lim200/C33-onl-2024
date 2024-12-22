package lesson_9_homework.Cloneable;

public class MyMain {
    public static void main(String[] args) {
        try {
            Point point1 = new Point(5, 10);
            System.out.println("Original Point: " + point1);


            Point point2 = (Point) point1.clone();
            System.out.println("Cloned Point: " + point2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: The object could not be cloned.");
            e.printStackTrace();
        }
    }
}
