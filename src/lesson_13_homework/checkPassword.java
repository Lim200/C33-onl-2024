package lesson_13_homework;

public class checkPassword {
    private String login;
    private String password;
    private String confirmPassword;


    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login should be less than 20 characters and should not contain spaces.");
        }

        if (password == null || password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password should be less than 20 characters, should not contain spaces, and should contain at least one digit.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmPassword do not match.");
        }

        return true;
    }
}
