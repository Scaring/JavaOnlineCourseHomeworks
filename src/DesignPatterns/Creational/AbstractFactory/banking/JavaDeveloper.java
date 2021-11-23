package DesignPatterns.Creational.AbstractFactory.banking;

import DesignPatterns.Creational.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code for banking project!");
    }
}
