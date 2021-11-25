package DesignPatterns.Practice.Composite;

public class Iphone extends Goods{
    public Iphone(String name, int price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
