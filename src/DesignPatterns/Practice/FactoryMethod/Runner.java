package DesignPatterns.Practice.FactoryMethod;

public class Runner {
    public static void main(String[] args) {
        DevFactory devFactory = createDevFactory("c++");

        Developer developer = devFactory.createDeveloper();

        developer.writeCode();
    }

    public static DevFactory createDevFactory(String spec){
        if(spec.equalsIgnoreCase("java")){
            return new JavaDevFactory();
        } else if(spec.equalsIgnoreCase("c++")){
            return new CppDevFactory();
        } else {
            throw new RuntimeException(spec + " unknown spec!");
        }
    }
}
