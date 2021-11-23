package DesignPatterns.Creational.AbstractFactory.banking;

import DesignPatterns.Creational.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages banking project!");
    }
}
