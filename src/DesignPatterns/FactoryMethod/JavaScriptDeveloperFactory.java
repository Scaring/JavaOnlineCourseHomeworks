package DesignPatterns.FactoryMethod;

public class JavaScriptDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaScriptDeveloper();
    }
}
