package DesignPatterns.AbstractFactory.website;

import DesignPatterns.AbstractFactory.ProjectManager;

public class PMWebsite implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website project!");
    }
}
