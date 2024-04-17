package Activity;

import UserPackage.User;

import java.awt.*;

public class ToDo {
    private String name;
    protected String color;
    protected double start_time;

    public ToDo(String name, String color, double start_time) {
        setName(name);
        if (isColorValid(color))
            this.color = color;
        else {
            System.out.println("this color is invalid");
            this.color = null;
        }
        setStart_time(start_time);
    }

    public ToDo() {

    }

    public void setStart_time(double start_time) {
        if (start_time > 0)
            this.start_time = start_time;
        else

            System.out.println("this time is invalid");
    }

    public static boolean isColorValid(String color) {
        if (color.length() != 6)
            return false;
        for (int i = 0; i < color.length(); i++) {
            if (((color.charAt(i) >= 48 && color.charAt(i) <= 57) || (color.charAt(i) >= 65 && color.charAt(i) <= 70)) == false) {
                return false;
            }

        }
        return true;
    }

    public String getInfo() {
        return "ToDo{" +
                "name='" + name + '\'' +
                ", start_time=" + start_time +
                '}';
    }

    protected void setColor(String color) {
        if (isColorValid(color))
            this.color = color;
        else {
            System.out.println("this color is invalid");
            this.color = null;
        }
    }
    public void setName(String name) {
        if(name.length()<11)
            this.name = name;
        else
            System.out.println("you can't set this name");
    }
}
