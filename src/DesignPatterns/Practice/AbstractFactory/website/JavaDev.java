package DesignPatterns.Practice.AbstractFactory.website;

import DesignPatterns.Practice.AbstractFactory.Developer;

public class JavaDev implements Developer {
    @Override
    public void writCode() {
        System.out.println("Java developer writes java code for website project!");
    }
}
