package Activity;

import UserPackage.*;

public class Task extends ToDo {

    private double finish_time;

    public Task(String name) {
        setName(name);
        this.color = null;
    }

    public Task(String name, String color) {
        setName(name);
        setColor(color);
    }

    public Task() {
    }

    public void setFinish_time(double finish_time) {
        if (finish_time > 0)
            this.finish_time = finish_time;
        else
            System.out.println("this time is invalid");
    }

    public double getDuration() {
        double dusmi = 0, dush = 0, dufmi = 0, dufh = 0, duration = 0;
        dusmi = (double) (((int) (start_time * 100)) % 100) / 100;
        dush = (int) (start_time);
        dufmi = (double) (((int) (finish_time * 100)) % 100) / 100;
        dufh = (int) (finish_time);
        if (dufmi < dusmi) {
            dufmi += 60.0 / 100;
            dufh--;
        }
        if (dufh < dush) {
            dufh += 24;
        }
        duration += dufmi - dusmi + dufh - dush;
        return duration;
    }

    @Override
    public String getInfo() {
        return "Task{" +
                "start_time=" + start_time +
                ", color='" + color + '\'' +
                ", finish_time=" + finish_time +
                '}';
    }
}
