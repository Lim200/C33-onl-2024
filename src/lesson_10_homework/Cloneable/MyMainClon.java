package lesson_10_homework.Cloneable;


public class MyMainClon {
    public static void main(String[] args) {
        try {
            String[] roles = {"Admin", "User"};
            UserClon user1 = new UserClon("Ivan", "iv", "pass1", 1, roles);
            System.out.println("Original: " + user1);

            UserClon shallowClonedUser = (UserClon) user1.clone();
            System.out.println("Shallow Cloned: " + shallowClonedUser);

            UserClon deepClonedUser = user1.deepClone();
            System.out.println("Deep Cloned: " + deepClonedUser);

        } catch (CloneNotSupportedException e) {
            System.out.println("Error: The object could not be cloned.");
            e.printStackTrace();
        }

    }
}