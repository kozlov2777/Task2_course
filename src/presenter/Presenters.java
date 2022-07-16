package presenter;

public class Presenters implements Presenter {
    private String surname;
    private String name;
    private String workExperience ;

    public Presenters(String surname, String name, String workExperience) {
        this.surname = surname;
        this.name = name;
        this.workExperience = workExperience;
    }

    @Override
    public String surname() {
        return surname;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String workExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "Presenters{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", workExperience='" + workExperience + '\'' +
                '}';
    }
}
