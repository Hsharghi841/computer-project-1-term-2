package UserPackage;

import java.util.Scanner;

public class User {
    private String username;
    private String password;
    public String name;
    public String lastname;
    public String email;
    public int streak;

    public User(String username, String password, String name, String lastname, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.streak = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Task createTask(){
        Scanner scanner = new Scanner(System.in);
        String taskName = scanner.nextLine();
    }

    public String getFullName(){
        return name + " " + lastname;
    }
}
