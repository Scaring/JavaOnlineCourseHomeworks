package DesignPatterns.Practice.AbstractFactory.website;

import DesignPatterns.Practice.AbstractFactory.Manager;

public class WebitePM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website project!");
    }
}
