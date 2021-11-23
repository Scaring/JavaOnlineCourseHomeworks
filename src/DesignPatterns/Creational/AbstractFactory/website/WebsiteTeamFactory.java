package DesignPatterns.Creational.AbstractFactory.website;

import DesignPatterns.Creational.AbstractFactory.Developer;
import DesignPatterns.Creational.AbstractFactory.ProjectManager;
import DesignPatterns.Creational.AbstractFactory.ProjectTeamFactory;
import DesignPatterns.Creational.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PMWebsite();
    }
}
