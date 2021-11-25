package DesignPatterns.Structural.Brige;

public class BankSystem extends Project {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProject() {
        System.out.println("Bank System development is in progress");
        developer.writeCode();
    }
}
