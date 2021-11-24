package DesignPatterns.Practice.FactoryMethod;

public class JavaDevFactory implements DevFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDev();
    }
}
