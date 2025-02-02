package lesson_13_homework;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login:");
        String login = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        System.out.println("Confirm password:");
        String confirmPassword = scanner.nextLine();

        try {
            boolean result = checkPassword.validate(login, password, confirmPassword);
            if (result) {
                System.out.println("Login and password are valid.");
                System.exit(0);
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        } finally {
            System.out.println("Finally will not be called");
        }

    }
}
