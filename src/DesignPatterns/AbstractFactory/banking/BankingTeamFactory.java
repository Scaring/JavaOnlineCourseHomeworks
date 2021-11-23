package DesignPatterns.AbstractFactory.banking;

import DesignPatterns.AbstractFactory.Developer;
import DesignPatterns.AbstractFactory.ProjectManager;
import DesignPatterns.AbstractFactory.ProjectTeamFactory;
import DesignPatterns.AbstractFactory.Tester;

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
