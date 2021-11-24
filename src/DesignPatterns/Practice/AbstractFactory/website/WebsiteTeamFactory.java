package DesignPatterns.Practice.AbstractFactory.website;

import DesignPatterns.Practice.AbstractFactory.Developer;
import DesignPatterns.Practice.AbstractFactory.Manager;
import DesignPatterns.Practice.AbstractFactory.TeamFactory;
import DesignPatterns.Practice.AbstractFactory.Tester;

public class WebsiteTeamFactory implements TeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDev();
    }

    @Override
    public Tester createTester() {
        return new QATaster();
    }

    @Override
    public Manager createPM() {
        return new WebitePM();
    }
}
