package lesson_10_homework;

public class MyMain {
    public static void main(String[] args) {
        User user1 = new User("Ivan", "iv", "pass1", 1);
        User user2 = new User("Ivan", "iv", "pass1", 1);
        User user3 = new User("Ivan", "iv", "pass1", 2);
        System.out.println("User1 == User2 " + user1.equals(user2));
        System.out.println("User1 == User3 " + user1.equals(user3));
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }

}
