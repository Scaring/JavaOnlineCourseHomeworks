package DesignPatterns.Creational.AbstractFactory.banking;

import DesignPatterns.Creational.AbstractFactory.Developer;
import DesignPatterns.Creational.AbstractFactory.ProjectManager;
import DesignPatterns.Creational.AbstractFactory.ProjectTeamFactory;
import DesignPatterns.Creational.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
