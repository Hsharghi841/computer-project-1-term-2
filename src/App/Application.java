package App;

import UserPackage.User;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Application {

    private User[] users = new User[10];
    private int userNo = 0;

    public User[] getUserByName(String name){
        User[] result = new User[10];
        int resultNo = 0;
        for (int i = 0; i < userNo; i++) {
            if(Objects.equals(users[i].getUsername(), name)){
                result[resultNo++] = users[i];
            }
        }
        if(resultNo == 0){
            return null;
        }
        return result;
    }

    public void addUser(String userName, String password){
        users[userNo++] = new User(userName, password, userName, "fgh", "fghj");
    }

    public void removeUser(String username){
        int i = 0;
        for (; i < userNo; i++) {
            if(Objects.equals(users[i].getUsername(), username)){
                break;
            }
        }
        i++;
        for(;i < userNo;i++){
            users[i - 1] = users[i];
        }
        userNo--;
    }



}
