package DesignPatterns.Practice.AbstractFactory.website;

import DesignPatterns.Practice.AbstractFactory.Tester;

public class QATaster implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests website code!");
    }
}
