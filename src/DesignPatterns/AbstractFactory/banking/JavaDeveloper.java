package DesignPatterns.AbstractFactory.banking;

import DesignPatterns.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code for banking project!");
    }
}
