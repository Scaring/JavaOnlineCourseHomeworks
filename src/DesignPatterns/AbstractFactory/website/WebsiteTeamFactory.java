package DesignPatterns.AbstractFactory.website;

import DesignPatterns.AbstractFactory.Developer;
import DesignPatterns.AbstractFactory.ProjectManager;
import DesignPatterns.AbstractFactory.ProjectTeamFactory;
import DesignPatterns.AbstractFactory.Tester;

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
