package DesignPatterns.Creational.AbstractFactory.website;

import DesignPatterns.Creational.AbstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website code!");
    }
}
