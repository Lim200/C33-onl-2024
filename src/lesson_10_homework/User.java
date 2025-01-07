package lesson_10_homework;

import java.util.Objects;

public class User {
    private String name;
    private String login;
    private String password;
    private int id;

    public User(String name, String login, String password, int id) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login, password, id);
    }

    @Override
    public String toString() {
        return "User:\n" +
                "name: " + name + '\n' +
                "login: " + login + '\n' +
                "password: " + password + '\n' +
                "id: " + id +
                '\n';
    }

}
