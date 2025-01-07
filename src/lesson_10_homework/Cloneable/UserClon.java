package lesson_10_homework.Cloneable;

public class UserClon implements Cloneable{
    private String name;
    private String login;
    private String password;
    private int id;
    private String[] roles;

    public UserClon(String name, String login, String password, int id, String[] roles) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.id = id;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User:\n" +
                "name: " + name + '\n' +
                "login: " + login + '\n' +
                "password: " + password + '\n' +
                "id: " + id +
                "roles: " + String.join(", ", roles) +
                '\n';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public UserClon deepClone() {
        String[] clonedRoles = roles.clone();
        return new UserClon(this.name, this.login, this.password, this.id, clonedRoles);
    }

}
