package main;

import broadcasting.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        TaskFactory taskOneFactory = new TaskFactory();
        BroadcastingFactory factory = new TaskFactory();
        taskOneFactory.TaskOne();
        taskOneFactory.TaskTwo();
        taskOneFactory.TaskThree();
    }
}
