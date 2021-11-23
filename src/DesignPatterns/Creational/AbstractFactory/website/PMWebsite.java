package DesignPatterns.Creational.AbstractFactory.website;

import DesignPatterns.Creational.AbstractFactory.ProjectManager;

public class PMWebsite implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website project!");
    }
}
