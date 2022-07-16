package presenter;

public class InvitedPresenters implements InvitedPresenter {
    private String surname;
    private String name;
    private String resume;

    public InvitedPresenters(String surname, String name, String resume) {
        this.surname = surname;
        this.name = name;
        this.resume = resume;
    }

    @Override
    public String surname() {
        return surname;
    }

    @Override
    public String name() {
        return surname;
    }

    @Override
    public String resume() {
        return surname;
    }
}
