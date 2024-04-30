package UserPackage;

import java.util.Objects;

import Activity.Task;
import Activity.ToDo;
import Utils.Utility;

public class User {
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String email;
    private int streak;
    private ToDo[] toDoList;
    private int toDosNum = 0;

    public User(String username, String password, String name, String lastname, String email) {
        this.username = username;
        setPassword(password);
        setFirstName(name);
        setLastName(lastname);
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
        if(Utility.isPasswordValid(password)){
            this.password = password;
        }else {
            System.out.println("password is not strong");
        }
    }

    public ToDo createToDo(String taskName){
        if(toDosNum == 0){
            toDoList = new Task[10];
        }
        if(isToDoRepetitive(taskName)){
            System.out.println("repeated name!");
            return null;
        }
        toDoList[toDosNum] = new ToDo();
        toDosNum++;
        return toDoList[toDosNum - 1];
    }

    public String getFullName(){
        return name.concat(" ".concat(lastname));
    }

    public boolean isToDoRepetitive(String taskName){
        for (int i = 0; i < toDosNum; i++) {
            if(Objects.equals(taskName, toDoList[i].name)){
                return true;
            }
        }
        return false;
    }

    public ToDo getTaskByName(String name){

        for(ToDo t : toDoList){
            if(Objects.equals(name, t.name)){
                return t;
            }
        }
        System.out.println("task not found!");
        return null;
    }

    public ToDo[] getToDosByColor(String color){
        ToDo[] tasks = new Task[toDosNum];
        int counter = 0;
        for(ToDo t : toDoList){
            if(Objects.equals(color, t.getColor())){
                tasks[counter++] = t;
            }
        }
        if(counter == 0)System.out.println("task not found!");
        return tasks;
    }

    public void setFirstName(String firstName){
        this.name = (firstName.toLowerCase().charAt(0) - 32) + firstName.toLowerCase().substring(1);
    }

    public void setLastName(String lastname){
        this.lastname = (lastname.toLowerCase().charAt(0) - 32) + lastname.toLowerCase().substring(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public ToDo[] getToDoList() {
        return toDoList;
    }

    public void setToDoList(ToDo[] toDoList) {
        this.toDoList = toDoList;
    }

    public int getToDosNum() {
        return toDosNum;
    }

    public void setToDosNum(int toDosNum) {
        this.toDosNum = toDosNum;
    }
}
