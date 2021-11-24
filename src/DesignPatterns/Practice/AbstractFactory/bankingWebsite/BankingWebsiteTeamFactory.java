package DesignPatterns.Practice.AbstractFactory.bankingWebsite;

import DesignPatterns.Practice.AbstractFactory.Developer;
import DesignPatterns.Practice.AbstractFactory.Manager;
import DesignPatterns.Practice.AbstractFactory.TeamFactory;
import DesignPatterns.Practice.AbstractFactory.Tester;

public class BankingWebsiteTeamFactory implements TeamFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDev();
    }

    @Override
    public Tester createTester() {
        return new ManualTaster();
    }

    @Override
    public Manager createPM() {
        return new BankingWebsitePM();
    }
}
