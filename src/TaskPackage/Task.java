package TaskPackage;

public class Task {
    public String name;
    public double start_time,finish_time;
    public Task(String name){
        this.name=name;
        start_time=0;
        finish_time=0;
    }
    public double getDuration(){
        double dusmi=0,dush=0,dufmi=0,dufh=0,duration = 0;
        dusmi=(double) (((int)(start_time*100))%100) / 100;
        dush=(int)(start_time);
        dufmi=(double)(((int)(finish_time*100))%100) / 100;
        dufh=(int)(finish_time);
        if(dufmi<dusmi){
            dufmi+= 60.0 / 100;
            dufh--;
        }
        if(dufh<dush){
            dufh+=24;
        }
        duration+=dufmi-dusmi+dufh-dush;
        return duration;
    }
}
