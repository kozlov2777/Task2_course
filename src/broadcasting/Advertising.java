package broadcasting;

public class Advertising implements PaidBroadcasting {
    private String name;
    private double duration;
    public Advertising(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }



    @Override
    public Double duration() {
        return duration;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Double cost() {
        return 5.0 * duration();
    }
}
