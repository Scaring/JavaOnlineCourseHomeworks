package DesignPatterns.AbstractFactory.banking;

import DesignPatterns.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages banking project!");
    }
}
