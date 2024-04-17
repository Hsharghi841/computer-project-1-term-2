package Activity;

public class Habit extends ToDo {
    private int frequency;
    private String category;

    @Override
    public String getInfo() {
        return "Habit{" +
                "frequency=" + frequency +
                ", category='" + category + '\'' +
                ", color='" + color + '\'' +
                ", start_time=" + start_time +
                '}';
    }

    @Override
    public void setStart_time(double start_time) {
        super.setStart_time((int)start_time);
    }
}
