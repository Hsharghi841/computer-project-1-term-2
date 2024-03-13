package TaskPackage;
import UserPackage.*;

public class Task {
    private User user;
    public String name;
    private final String color;
    private double start_time,finish_time;

    public Task(User user, String name) {
        this.user = user;
        this.name = name;
        this.color=null;
    }

    public Task(User user, String name, String color) {
        this.user = user;
        this.name = name;
        if (isColorValid(color))
            this.color = color;
        else {
            System.out.println("this color is invalid");
            this.color=null;
        }
    }

    public void setStart_time(double start_time) {
        if(start_time>0)
            this.start_time = start_time;
        else
            System.out.println("this time is invalid");
    }

    public void setFinish_time(double finish_time) {
        if(finish_time>0)
            this.finish_time = finish_time;
        else
            System.out.println("this time is invalid");
    }

    public double getDuration(){
        double dusmi=0,dush=0,dufmi=0,dufh=0,duration = 0;
        dusmi=(double) (((int)(start_time*100))%100) / 100;
        dush=(int)(start_time);
        dufmi=(double)(((int)(finish_time*100))%100) / 100;
        dufh=(int)(finish_time);
        if(dufmi<dusmi){
            dufmi+=60.0/100;
            dufh--;
        }
        if(dufh<dush){
            dufh+=24;
        }
        duration+=dufmi-dusmi+dufh-dush;
        return duration;
    }
    public static boolean isColorValid(String color){
        if(color.length()!=6)
            return false;
        for (int i = 0; i < color.length(); i++) {
            if (((color.charAt(i)>=48&&color.charAt(i)<=57)||(color.charAt(i)>=65&&color.charAt(i)<=70))==false){
                return false;
            }

        }
        return true;
    }
}
