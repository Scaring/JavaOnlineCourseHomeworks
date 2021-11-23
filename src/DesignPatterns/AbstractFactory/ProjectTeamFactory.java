package DesignPatterns.AbstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
