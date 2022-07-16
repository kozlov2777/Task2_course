package presenter;

import java.util.ArrayList;

public class TaskPresenters implements AllPresenters {
    @Override
    public ArrayList<Presenters> createPresenters() {
         ArrayList<Presenters> presenters = new ArrayList<>();
         presenters.add(new Presenters("Kozlov","Sasha","5 years"));
         presenters.add(new Presenters("Muradin","Pavel","3 years"));
         return presenters;
    }

    @Override
    public ArrayList<InvitedPresenters> createInvitedPresenters() {
        ArrayList<InvitedPresenters> invitedPresenters = new ArrayList<>();
        invitedPresenters.add(new InvitedPresenters("Gostrik","Volodymr", "bla bla bla"));
        invitedPresenters.add(new InvitedPresenters("Lushpenko","Eduard", "bla bla bla bla bla"));
        return invitedPresenters;
    }
    public void TaskPresenters(){
        ArrayList<String> allpresenters = new ArrayList<>();
        allpresenters.add(createPresenters().get(0).surname());
        allpresenters.add(createPresenters().get(1).surname());
        allpresenters.add(createInvitedPresenters().get(0).surname());
        allpresenters.add(createInvitedPresenters().get(1).surname());
        System.out.println(allpresenters);

    }
}
