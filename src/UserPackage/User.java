package UserPackage;

import java.util.Objects;

import Activity.Task;
import Utils.Utility;

public class User {
    private String username;
    private String password;
    private String name;
    private String lastname;
    public String email;
    public int streak;
    private Task[] taskList;
    private int tasksNum = 0;

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

    public Task createTask(String taskName){
        if(tasksNum == 0){
            taskList = new Task[10];
        }
        if(isTaskRepetitive(taskName)){
            System.out.println("repeated name!");
            return null;
        }
        taskList[tasksNum] = new Task(this, taskName);
        tasksNum++;
        return taskList[tasksNum - 1];
    }

    public String getFullName(){
        return name.concat(" ".concat(lastname));
    }

    public boolean isTaskRepetitive(String taskName){
        for (int i = 0; i < tasksNum; i++) {
            if(Objects.equals(taskName, taskList[i].getName())){
                return true;
            }
        }
        return false;
    }

    public Task getTaskByName(String name){

        for(Task t : taskList){
            if(Objects.equals(name, t.getName())){
                return t;
            }
        }
        System.out.println("task not found!");
        return null;
    }

    public Task[] getTaskByColor(String color){
        Task[] tasks = new Task[tasksNum];
        int counter = 0;
        for(Task t : taskList){
            if(Objects.equals(color, t.color)){
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


}
