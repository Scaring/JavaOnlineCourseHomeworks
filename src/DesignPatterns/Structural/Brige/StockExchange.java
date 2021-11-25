package DesignPatterns.Structural.Brige;

public class StockExchange extends Project {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProject() {
        System.out.println("Stock Exchange project is in progress");
        developer.writeCode();
    }
}
