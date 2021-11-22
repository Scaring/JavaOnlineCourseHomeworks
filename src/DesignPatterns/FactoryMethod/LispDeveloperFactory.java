package DesignPatterns.FactoryMethod;

public class LispDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new LispDevepoper();
    }
}
