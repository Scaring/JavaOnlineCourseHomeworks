package DesignPatterns.FactoryMethod;

class FactoryMethod {
    public static void main(String[] args) {
        DeveloperFactory devFact = createFactoryBySpec("lisp");
        Developer dev = devFact.createDeveloper();

        dev.writeCode();
    }

    static DeveloperFactory createFactoryBySpec(String spec) {
        if (spec.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (spec.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (spec.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else if (spec.equalsIgnoreCase("js")) {
            return new JavaScriptDeveloperFactory();
        } else if(spec.equalsIgnoreCase("lisp")){
            return new LispDeveloperFactory();
        } else {
            throw new RuntimeException(spec + " is unknown spec!");
        }
    }
}