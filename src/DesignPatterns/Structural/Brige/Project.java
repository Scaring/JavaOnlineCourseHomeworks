package DesignPatterns.Structural.Brige;

public abstract class Project {
    protected Developer developer;

    protected Project(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProject();
}
