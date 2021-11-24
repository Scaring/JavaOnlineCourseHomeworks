package DesignPatterns.Practice.AbstractFactory.bankingWebsite;

import DesignPatterns.Practice.AbstractFactory.Developer;

public class PhpDev implements Developer {
    @Override
    public void writCode() {
        System.out.println("Php dev writes code for banking website!");
    }
}
