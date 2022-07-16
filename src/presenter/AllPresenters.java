package presenter;

import broadcasting.Interview;

import java.util.ArrayList;

public interface AllPresenters {
    ArrayList<Presenters> createPresenters();
    ArrayList<InvitedPresenters> createInvitedPresenters();
}
