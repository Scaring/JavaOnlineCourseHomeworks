package DesignPatterns.Practice.AbstractFactory;

import DesignPatterns.Practice.AbstractFactory.bankingWebsite.BankingWebsiteTeamFactory;
import DesignPatterns.Practice.AbstractFactory.website.WebsiteTeamFactory;

public class Runner {
    public static void main(String[] args) {
        TeamFactory teamFactory = createTeamFactoryBySpec("website");

        Developer developer = teamFactory.createDeveloper();
        Tester tester = teamFactory.createTester();
        Manager manager = teamFactory.createPM();

        System.out.println("Creating project.... \n");
        developer.writCode();
        tester.testCode();
        manager.manageProject();
    }

    public static TeamFactory createTeamFactoryBySpec(String spec){
        if(spec.equalsIgnoreCase("banking")){
            return new BankingWebsiteTeamFactory();
        } else if(spec.equalsIgnoreCase("website")){
            return new WebsiteTeamFactory();
        } else {
            throw new RuntimeException(spec + " is unknown spec!");
        }
    }
}
