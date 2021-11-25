package DesignPatterns.Structural.Brige;

public class ProjectRunner {
    public static void main(String[] args) {
        Project[] projects = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for(Project project : projects){
            project.developProject();
        }
    }
}
