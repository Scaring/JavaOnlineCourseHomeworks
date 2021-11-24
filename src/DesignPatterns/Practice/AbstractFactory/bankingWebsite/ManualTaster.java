package DesignPatterns.Practice.AbstractFactory.bankingWebsite;

import DesignPatterns.Practice.AbstractFactory.Tester;

public class ManualTaster implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests banking website code!");
    }
}
