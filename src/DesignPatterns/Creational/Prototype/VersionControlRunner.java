package DesignPatterns.Creational.Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Super Project", "SourceCode code = new SourceCode()");
        System.out.println(master);
        System.out.println("\n================================\n");

//        Project masterCopy = (Project) master.copy();
//        System.out.println(masterCopy);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);
    }
}
