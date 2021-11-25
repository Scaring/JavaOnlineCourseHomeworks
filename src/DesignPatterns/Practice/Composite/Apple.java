package DesignPatterns.Practice.Composite;

public class Apple extends Goods{
    public Apple(String name, int price) {
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
