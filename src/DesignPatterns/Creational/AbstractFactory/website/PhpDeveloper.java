package DesignPatterns.Creational.AbstractFactory.website;

import DesignPatterns.Creational.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer ");
    }
}
