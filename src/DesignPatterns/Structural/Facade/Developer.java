package DesignPatterns.Structural.Facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer is solving bugs...");
        } else {
            System.out.println("Developer is learning");
        }
    }
}
