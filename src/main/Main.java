package main;

import broadcasting.*;
import presenter.TaskPresenters;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        TaskFactory taskOneFactory = new TaskFactory();
        TaskPresenters taskPresenters = new TaskPresenters();
        BroadcastingFactory factory = new TaskFactory();
        taskOneFactory.TaskOne();
        taskOneFactory.TaskTwo();
        taskOneFactory.TaskThree();
        taskPresenters.TaskPresenters();
    }
}
