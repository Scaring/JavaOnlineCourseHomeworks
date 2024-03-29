package module_10.task5;

public class Developer extends Employee {
    private Level level;

    public Developer(String name, int age, double salary, Level level) {
        super(name, age, salary);
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return super.toString() + ", level=" + level;
    }
}

enum Level{
    JUNIOR, MIDDLE, SENIOR
}