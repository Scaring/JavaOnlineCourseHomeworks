package DesignPatterns.AbstractFactory.website;

import DesignPatterns.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer ");
    }
}
