package DesignPatterns.Practice.AbstractFactory.bankingWebsite;

import DesignPatterns.Practice.AbstractFactory.Manager;

public class BankingWebsitePM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("PM manages banking website project!");
    }
}
