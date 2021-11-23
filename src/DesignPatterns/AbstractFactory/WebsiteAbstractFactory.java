package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.website.WebsiteTeamFactory;

public class WebsiteAbstractFactory {
    public static void main(String[] args) {
        ProjectTeamFactory team = new WebsiteTeamFactory();

        Developer dev = team.getDeveloper();
        Tester test = team.getTester();
        ProjectManager manager = team.getProjectManager();

        System.out.println("Creating website project...");
        dev.writeCode();
        test.testCode();
        manager.manageProject();
    }
}
