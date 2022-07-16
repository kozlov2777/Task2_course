package broadcasting;

public class Interview implements PaidBroadcasting {
    private String name;
    private Double duration;

    public Interview(String name, Double duration) {
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
        return 0.5*duration();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
