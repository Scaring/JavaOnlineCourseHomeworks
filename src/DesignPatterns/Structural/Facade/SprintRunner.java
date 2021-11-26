package DesignPatterns.Structural.Facade;

public class SprintRunner {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblems();

//        Job job = new Job();
//        job.doJob();
//
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);
//
//        bugTracker.finishSprint();
//        developer.doJobBeforeDeadline(bugTracker);
    }
}
