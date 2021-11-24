package DesignPatterns.Practice.Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
