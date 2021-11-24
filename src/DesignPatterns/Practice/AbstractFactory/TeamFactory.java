package DesignPatterns.Practice.AbstractFactory;

public interface TeamFactory {
    Developer createDeveloper();
    Tester createTester();
    Manager createPM();
}
