package DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.banking.BankingTeamFactory;

public class BankingAbstractFactory {
    public static void main(String[] args) {
        ProjectTeamFactory team = new BankingTeamFactory();

        Developer dev = team.getDeveloper();
        Tester test = team.getTester();
        ProjectManager manager = team.getProjectManager();

        System.out.println("Creating banking project...");
        dev.writeCode();
        test.testCode();
        manager.manageProject();
    }
}
