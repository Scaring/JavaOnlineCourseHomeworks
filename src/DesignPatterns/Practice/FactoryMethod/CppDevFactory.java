package DesignPatterns.Practice.FactoryMethod;

public class CppDevFactory implements DevFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDev();
    }
}
